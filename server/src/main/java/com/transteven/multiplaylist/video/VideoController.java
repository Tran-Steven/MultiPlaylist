package com.transteven.multiplaylist.video;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/video")
public class VideoController {

  @Autowired VideoService videoservice;

  @GetMapping(value = "/{userID}/{playlistID}/{videoID}")
  public void getVideo(
      @PathVariable Long userID, @PathVariable Long playlistID, @PathVariable Long videoID) {}
}
