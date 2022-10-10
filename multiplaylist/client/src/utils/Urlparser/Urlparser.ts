import axios from "axios";

export function Urlparser(props: URL) {
  let url = new URL(props);

  // If the link submitted is a shortened redirect link -> turn into regular link
  if (url.hostname.includes("youtu.be" || "dai.ly")) {
    axios.get(url.href).then(function (res: any) {
      url = res;
    });
  }
  // Determines if URL is playlist or video and set as key and set the value as the id
  if (url.hostname.includes("dailymotion")) {
    axios.post("/playlists/add/dailymotion", {
      url,
    });
  } else if (url.hostname === "www.youtube.com") {
    axios.post("/playlists/add/youtube", {
      url,
    });
  } else {
    console.log("Not valid link");
  }
}
