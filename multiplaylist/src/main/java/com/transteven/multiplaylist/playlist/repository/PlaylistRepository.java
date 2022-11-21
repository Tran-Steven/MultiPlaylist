package com.transteven.multiplaylist.playlist.repository;


import com.transteven.multiplaylist.playlist.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DailymotionRepository uses JpaRepository methods to:
 * 
 * Recieve, Update and Delete: Youtube Playlist data from the database.
 *@param DailymotionModel object containing a String list containing data on all videos in a playlist.
 *@param Long the primary key.
 */
@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
