import axios from "axios";

import React, { useState } from "react";
import { Urlparser } from "@utils/Urlparser/Urlparser";
const MultiPlaylistMain = () => {
  const [link, setLink] = useState<any>("");

  const handleSend = async () => {
    try {
      Urlparser(link);
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div>
      <form
        onSubmit={() => {
          handleSend();
        }}
      >
        <input
          type="url"
          value={link}
          onChange={(e) => {
            setLink(e.target.value);
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
