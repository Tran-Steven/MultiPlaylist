package com.transteven.multiplaylist.playlist.dao;

import com.transteven.multiplaylist.playlist.Playlist;
import com.transteven.multiplaylist.playlist.PlaylistRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlaylistDAOJPA implements PlaylistDAO {

  private final PlaylistRepository playlistRepository;

  @Autowired
  public PlaylistDAOJPA(final PlaylistRepository playlistRepository) {
    this.playlistRepository = playlistRepository;
  }

  @Override
  public void createPlaylist(final Playlist playlist) {
    playlistRepository.save(playlist);
  }

  @Override
  public Optional<Playlist> getPlaylistById(final int id) {
    return playlistRepository.findById(id);
  }
}
