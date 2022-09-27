package com.transteven.multiplaylist.youtube.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transteven.multiplaylist.youtube.model.YoutubeModel;
import com.transteven.multiplaylist.youtube.repository.YoutubeRepository;

/**
 * YoutubeService Deals with Youtube class object(YoutubeModel)
 * Uses methods from JpaRepository extended by YoutubeRepository.
 */
@Service
public class YoutubeService {
        @Autowired
            YoutubeRepository ytRepository;  

            /**
             * CREATE
             * Saves the YoutubeModel object to the database
             * 
             * @param yt YoutubeModel object containing a String list.
             * @return the YoutubeModel object are saving it to the database.
             */
            public YoutubeModel createYoutube(YoutubeModel yt) {
                return ytRepository.save(yt);
            }
                        

            /**
             * READ
             * @return the list of all Youtube playlists in the database.
             */
            public List<YoutubeModel> getYoutube() {
                return ytRepository.findAll();
            }
                        

            /**
             * DELETE
             * Deletes a playlist where the id in the table is equal to the id passed.
             * 
             * @param ytId the id of the YouTube playlist in the database.
             */
            public void deleteYoutube(Long ytId) {
                ytRepository.deleteById(ytId);
            }  
            
            /**
             * UPDATE
             * Searches for an Youtube object in the database that matches ytId and sets it to yt.
             * Update object with details in youtubeDetails.
             * 
             * @param ytId the id of the YouTube playlist in the database.
             * @param youtubeDetails youtube object containing new youtube details.
             * @return save the yt object to the database.
             */
            public YoutubeModel updateYoutube(Long ytId, YoutubeModel youtubeDetails) {
                YoutubeModel yt = ytRepository.findById(ytId).get();
                yt.setItems(youtubeDetails.getItems());
                            
                return ytRepository.save(yt);                                
            }
}

