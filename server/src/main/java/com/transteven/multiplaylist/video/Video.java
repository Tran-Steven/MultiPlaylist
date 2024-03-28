package com.transteven.multiplaylist.video;

import com.transteven.multiplaylist.playlist.Playlist;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Video {

  @EmbeddedId
  private int id;

  @Column(columnDefinition = "VARCHAR(255)")
  private String url;

  @ManyToOne
  @MapsId("playlistId")
  @JoinColumn(name = "playlist_id")
  private Playlist playlist;
}
