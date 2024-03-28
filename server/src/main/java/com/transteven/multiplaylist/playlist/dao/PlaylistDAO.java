package com.transteven.multiplaylist.playlist.dao;

import com.transteven.multiplaylist.playlist.Playlist;
import java.util.Optional;

public interface PlaylistDAO {
  void createPlaylist(Playlist playlist);
  Optional<Playlist> getPlaylistById(int id);
  void deletePlaylist(int id);
}
