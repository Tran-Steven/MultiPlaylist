import axios from "axios";
import "./MPM.module.css";
import React, { useState } from "react";
import { Urlparser } from "@utils/Urlparser/Urlparser";
const MultiPlaylistMain = () => {
  const [link, setLink] = useState<any>("");

  // const handleSend = async () => {
  //   try {
  //     Urlparser(link);
  //   } catch (error) {
  //     console.log(error);
  //   }
  // };

  return (
    <div className={"temp"}>
      {/*<form*/}
      {/*  onSubmit={() => {*/}
      {/*    handleSend();*/}
      {/*  }}*/}
      {/*>*/}
      {/*  <input*/}
      {/*    type="url"*/}
      {/*    value={link}*/}
      {/*    onChange={(e) => {*/}
      {/*      setLink(e.target.value);*/}
      {/*    }}*/}
      {/*  >*/}
      {/*    Insert Test*/}
      {/*  </input>*/}
      {/*  <input type="submit" value="Submit Test" />*/}
      {/*</form>*/}
        <div className={"container"}>
            <video autoPlay loop muted>
                <source src={"https://www.youtube.com/watch?v=z9Ug-3qhrwY"}/>
            </video>
            <div className={"txtBox"}>
                <h1>MultiPlaylist</h1>
            </div>
        </div>
    </div>
  );
};

export default MultiPlaylistMain;
