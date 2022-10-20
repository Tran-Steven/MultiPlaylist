package com.transteven.multiplaylist.youtube.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Creates a model for YouTube Playlists.
 * YouTube Data API v3 (PlaylistItems: list) is stored in a PostgreSQL server.
 * Only one String list instance variable is made to take in "items": [ playlistItem Resource ]
 */
@Entity
@Table(name = "youtube")
public class YoutubeModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
        private int id;


    @Column(name="array")
    @Transient
    private ArrayList<String> items;

    /**
     * A setter for the ArrayList<String>
     * 
     * @param items an Array that contains data on all videos in a playlist.
     * @throws NullPointerException if playlist contains no videos or is null
     */
    public void setItems(ArrayList<String> items) {
        if (items == null) {
            throw new NullPointerException("Playlist must contain at least one video");
          }
        this.items = items;
      }
public YoutubeModel(){

}

public YoutubeModel(int id){
        super();
        this.id = id;
}
    public ArrayList<String> getItems() {
        return new ArrayList<>(items);
      }


}
