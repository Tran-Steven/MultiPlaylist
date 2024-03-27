package com.transteven.multiplaylist.playlist;

import com.transteven.multiplaylist.playlist.dao.PlaylistDAO;
import com.transteven.multiplaylist.video.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {

  private final PlaylistDAO playlistDAO;

  @Autowired
  public PlaylistService(final PlaylistDAO playlistDAO) {
    this.playlistDAO = playlistDAO;
  }

  public void createPlaylist(Playlist playlist) {
    playlistDAO.createPlaylist(playlist);
  }

  public PlaylistDTO getPlaylistById(final Long id) {
    return playlistDAO
      .getPlaylistById(id)
      .map(Playlist::toDTO)
      .orElseThrow(() ->
        new IllegalStateException("Playlist with id " + id + " does not exist")
      );
  }
}
