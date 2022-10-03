import { any } from "prop-types";
import React, { useState } from "react";

function PlaylistService(playlistUrl: any) {
  const [playlistId, setPlaylistId] = useState<String[]>([]);
  const url = new URL(playlistUrl);
}
export default PlaylistService;
