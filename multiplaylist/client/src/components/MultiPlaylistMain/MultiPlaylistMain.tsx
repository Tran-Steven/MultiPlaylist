import axios from "axios";
import "@assets/MPM.module.css";
import React, { useState } from "react";
import { Urlparser } from "@utils/Urlparser/Urlparser";
import styles from "@assets/MPM.module.css"
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
      {/*  />*/}
      {/*  <input type="submit" value="Submit Test" />*/}
      {/*</form>*/}
        <div className={styles.container}>
            <video autoPlay loop muted>
                <source src={"/gfcmain.mp4"} type={"video/mp4"}/>
            </video>
            <div className={styles.txtbox}>
                <h1>MultiPlaylist</h1>
            </div>
        </div>
    </div>
  );
};

export default MultiPlaylistMain;
