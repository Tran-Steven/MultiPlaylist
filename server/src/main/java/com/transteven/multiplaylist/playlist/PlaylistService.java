package com.transteven.multiplaylist.playlist;

import com.transteven.multiplaylist.playlist.dao.PlaylistDAO;
import com.transteven.multiplaylist.playlist.dto.PlaylistDTO;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {

  private final PlaylistDAO playlistDAO;

  public PlaylistService(final PlaylistDAO playlistDAO) {
    this.playlistDAO = playlistDAO;
  }

  public void createPlaylist(Playlist playlist) {
    playlistDAO.createPlaylist(playlist);
  }

  public void deletePlaylist(final int id) {
    playlistDAO.deletePlaylist(id);
  }

  public PlaylistDTO getPlaylistById(final int id) {
    return playlistDAO
      .getPlaylistById(id)
      .map(Playlist::toDTO)
      .orElseThrow(() ->
        new IllegalStateException("Playlist with id " + id + " does not exist")
      );
  }
}
