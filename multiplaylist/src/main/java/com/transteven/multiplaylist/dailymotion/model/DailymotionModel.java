package com.transteven.multiplaylist.dailymotion.model;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dailymotion")
public class DailymotionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
        private Long id;

    @Column(name="playlist")
    private ArrayList<String> dailyItems = new ArrayList<>();
    
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
        this.dailyItems = items;
      }


    public ArrayList<String> getItems() {
        return new ArrayList<String>(dailyItems);
      }
}
