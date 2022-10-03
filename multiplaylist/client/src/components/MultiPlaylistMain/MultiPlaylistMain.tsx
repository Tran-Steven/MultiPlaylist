import React, { useState } from "react";
import PlaylistService from "@utils/Playlist/PlaylistService";
const MultiPlaylistMain = () => {
  const [id, setId] = useState("");

  return (
    <div>
      <form
        onSubmit={() => {
          PlaylistService(id);
        }}
      >
        <input
          type="url"
          value={id}
          onChange={(e) => {
            setId(e.target.value);
          }}
        >
          Insert Test
        </input>
        <input type="submit" value="Submit Test" />
      </form>
    </div>
  );
};

export default MultiPlaylistMain;
