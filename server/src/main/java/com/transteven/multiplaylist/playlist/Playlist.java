package com.transteven.multiplaylist.playlist;

import com.transteven.multiplaylist.playlist.dto.PlaylistDTO;
import com.transteven.multiplaylist.video.Video;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Playlist {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, updatable = false)
  private int id;

  @Column(columnDefinition = "VARCHAR(255)", nullable = false)
  private String name;

  @OneToMany(mappedBy = "playlist")
  private List<Video> playlistVideos;

  public Playlist(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public PlaylistDTO toDTO() {
    return new PlaylistDTO(id, name);
  }
}
