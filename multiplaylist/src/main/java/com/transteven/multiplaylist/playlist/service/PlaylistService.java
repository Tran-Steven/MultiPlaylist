package com.transteven.multiplaylist.playlist.service;

import com.transteven.multiplaylist.playlist.model.Playlist;
import com.transteven.multiplaylist.playlist.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * DailymotionService Deals with dailymotion class object(DailymotionModel)
 * Uses methods from JpaRepository extended by DailymotionRepository.
 */
@Service
public class PlaylistService {
    @Autowired
    PlaylistRepository dmRepository;


    /**
     * CREATE
     * Saves the DailymotionModel object to the database
     * 
     * @param dm DailymotionModel object containing a String list.
     * @return the DailymotionModel object are saving it to the database.
     */
    public Playlist createDailymotion(Playlist dm) {
        return dmRepository.save(dm);
    }
                

    /**
     * READ
     * @return the list of all Dailymotion playlists in the database.
     */
    public List<Playlist> getDailymotion() {
        return dmRepository.findAll();
    }
                

    /**
     * DELETE
     * Deletes a playlist where the id in the table is equal to the id passed.
     * 
     * @param dmId the id of the Dailymotion playlist in the database.
     */
    public void deleteDailymotion(Long dmId) {
        dmRepository.deleteById(dmId);
    }  
    
    /**
     * UPDATE
     * Searches for an Dailymotion object in the database that matches dmId and sets it to dm.
     * Update object with details in DailymotionDetails.
     * 
     * @param dmId the id of the Dailymotion playlist in the database.
     * @param dailymotionDetails Dailymotion object containing new Dailymotion details.
     * @return save the dm object to the database.
     */
    public Playlist updateDailymotion(Long dmId, Playlist dailymotionDetails) {
        Playlist dm = dmRepository.findById(dmId).get();
        dm.setItems(dailymotionDetails.getItems());
                    
        return dmRepository.save(dm);                                
    }
}
