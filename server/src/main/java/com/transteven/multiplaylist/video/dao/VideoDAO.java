package com.transteven.multiplaylist.video.dao;

import com.transteven.multiplaylist.video.Video;
import java.util.Optional;

public interface VideoDAO {
  void addVideo(Video video);
  Optional<Video> getVideoById(int id);
  void deleteVideo(int id);
}
