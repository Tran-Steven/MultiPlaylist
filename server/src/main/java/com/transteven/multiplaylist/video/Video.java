package com.transteven.multiplaylist.video;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Video {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, updatable = false)
  private Long id;

  @Column(columnDefinition = "VARCHAR(255)")
  private String url;

  public Video() {}

  public Video(Long id, String url) {
    this.id = id;
    this.url = url;
  }
}
