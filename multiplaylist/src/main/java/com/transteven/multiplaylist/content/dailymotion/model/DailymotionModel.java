package com.transteven.multiplaylist.content.dailymotion.model;


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
    private ArrayList<String> items = new ArrayList<>();
}
