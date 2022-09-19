package com.transteven.multiplaylist.content.youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transteven.multiplaylist.content.youtube.model.YoutubeModel;

/**
 * YoutubeRepository uses JpaRepository methods to:
 * 
 * Recieve, Update and Delete: Youtube Playlist data from the database.
 *@param YoutubeModel object containing a String list containing data on all videos in a playlist.
 *@param Long the primary key.
 */
@Repository
public interface YoutubeRepository extends JpaRepository<YoutubeModel, Long> {
}
