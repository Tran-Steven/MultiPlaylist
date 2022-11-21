import axios from "axios";

export async function Urlparser(props: URL) {
  let url = new URL(props);

    // If the link submitted is a shortened redirect link -> turn into regular link
  if (url.hostname.includes("youtu.be" || "dai.ly")) {
    url = await axios.get(url.href)
  }

  // Determines if URL is playlist or video and set as key and set the value as the id
  if (url.hostname.includes("dailymotion")) {
    let param = url.pathname.split("/");
    await axios.post("/playlists/add/dailymotion", {
      data: JSON.stringify({
        host: url.host,
        type: param[0],
        id: param[1]
      })
    });
  } else if (url.hostname === "www.youtube.com") {
    await axios.post("/playlists/add/youtube", {
      data: JSON.stringify({
        host: url.host,
        type: url.pathname,
        id: url.searchParams.get('v' || 'list')
      })
    });
  } else {
    console.log("Not valid link");
  }
}
