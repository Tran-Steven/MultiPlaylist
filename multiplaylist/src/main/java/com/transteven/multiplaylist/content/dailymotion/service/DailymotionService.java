package com.transteven.multiplaylist.content.dailymotion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transteven.multiplaylist.content.dailymotion.model.DailymotionModel;
import com.transteven.multiplaylist.content.dailymotion.repository.DailymotionRepository;


/**
 * DailymotionService Deals with dailymotion class object(DailymotionModel)
 * Uses methods from JpaRepository extended by DailymotionRepository.
 */
@Service
public class DailymotionService {
    @Autowired
    DailymotionRepository dmRepository;  


    /**
     * CREATE
     * Saves the DailymotionModel object to the database
     * 
     * @param dm DailymotionModel object containing a String list.
     * @return the DailymotionModel object are saving it to the database.
     */
    public DailymotionModel createDailymotion(DailymotionModel dm) {
        return dmRepository.save(dm);
    }
                

    /**
     * READ
     * @return the list of all Dailymotion playlists in the database.
     */
    public List<DailymotionModel> getDailymotion() {
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
     * @param DailymotionDetails Dailymotion object containing new Dailymotion details.
     * @return save the dm object to the database.
     */
    public DailymotionModel updateDailymotion(Long dmId, DailymotionModel DailymotionDetails) {
        DailymotionModel dm = dmRepository.findById(dmId).get();
        dm.setItems(DailymotionDetails.getItems());
                    
        return dmRepository.save(dm);                                
    }
}
