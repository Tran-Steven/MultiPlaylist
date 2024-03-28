package com.transteven.multiplaylist.video.dao;

import com.transteven.multiplaylist.video.Video;
import com.transteven.multiplaylist.video.VideoRepository;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class VideoDAOJPA implements VideoDAO {

  private final VideoRepository videoRepository;

  public VideoDAOJPA(final VideoRepository videoRepository) {
    this.videoRepository = videoRepository;
  }

  @Override
  public void addVideo(Video video) {
    videoRepository.save(video);
  }

  @Override
  public Optional<Video> getVideoById(final int id) {
    return videoRepository.findById(id);
  }

  @Override
  public void deleteVideo(final int id) {
    videoRepository.deleteById(id);
  }
}
