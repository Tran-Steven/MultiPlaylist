import axios from "axios";

function Urlparser(props: URL) {
  const parsedUrlData = new Map();
  let url = new URL(props);

  // If the link submitted is a shortened redirect link -> turn into regular link
  if (url.hostname.includes("youtu.be" || "dai.ly")) {
    axios.get(url.href).then(function (res: any) {
      url = res;
    });
  }

  // Determines if URL is playlist or video and set as key and set the value as the id
  if (url.hostname.includes("dailymotion")) {
    let dmVideoIds = [];
    parsedUrlData.set(url.pathname.split("/")[0], url.pathname.split("/")[1]);
    if (parsedUrlData.has("video")) {
      dmVideoIds[0] = parsedUrlData.get("video");
    } else {
      let playlist = parsedUrlData.get("playlist");

      axios
        .post("/playlists/dm", {
          playlist,
        })
        .then(function (res) {
          console.log(res);
        });
    }
  } else if (url.hostname === "www.youtube.com") {
    let ytVideoids = [];
    url.pathname.includes("playlist")
      ? parsedUrlData.set("playlist", url.searchParams.get("list"))
      : parsedUrlData.set("video", url.searchParams.get("v"));
  }
}

Urlparser.propTypes = {};

export default Urlparser;
