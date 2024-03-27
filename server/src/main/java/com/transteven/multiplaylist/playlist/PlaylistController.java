package com.transteven.multiplaylist.playlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api/playlist")
public class PlaylistController {

  private final PlaylistService playlistService;

  @Autowired
  public PlaylistController(final PlaylistService playlistService) {
    this.playlistService = playlistService;
  }

  @PostMapping("/create")
  public ResponseEntity<String> addPlaylist(
    @RequestBody final Playlist playlist
  ) {
    playlistService.createPlaylist(playlist);
    return new ResponseEntity<>(
      "Playlist created successfully",
      HttpStatus.CREATED
    );
  }
}
