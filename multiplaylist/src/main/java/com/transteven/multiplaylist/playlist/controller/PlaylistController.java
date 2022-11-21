package com.transteven.multiplaylist.playlist.controller;


import com.transteven.multiplaylist.playlist.model.Playlist;
import com.transteven.multiplaylist.playlist.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class PlaylistController {
    @Autowired
    PlaylistService dmService;

    @PostMapping(value="/playlist/add/dailymotion")
    public Playlist createDailymotion(@RequestBody Playlist dm) {
        return dmService.createDailymotion(dm);
    }


    @GetMapping(value="/playlist/add/dailymotion")
        public List<Playlist> readDailymotion() {
        return dmService.getDailymotion();
    }


    @PutMapping(value="/playlist/add/dailymotion/{dmId}")
        public Playlist readDailymotion(@PathVariable(value = "dmId") Long id, @RequestBody Playlist dmDetails) {
        return dmService.updateDailymotion(id, dmDetails);
    }


    @DeleteMapping(value="/playlist/add/dailymotion/{dmId}")
        public void deleteDailymotion(@PathVariable(value = "dmId") Long id) {
        dmService.deleteDailymotion(id);
    }
}
