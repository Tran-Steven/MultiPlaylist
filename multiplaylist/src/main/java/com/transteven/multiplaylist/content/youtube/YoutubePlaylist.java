package com.transteven.multiplaylist.content.youtube;

import com.transteven.multiplaylist.content.Content;
import javax.persistence.*;


@Entity
public class YoutubePlaylist implements Content {
    
    String playlistId;
    int videoAmount = 0;

    @Override
    public void getInstancesAmount(int instances){
        videoAmount = instances;
    }

    @Override
    public void getPlaylistId(String youtubePlaylist){
        playlistId = youtubePlaylist;
    }
}
