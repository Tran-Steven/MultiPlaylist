package com.transteven.multiplaylist.dailymotion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transteven.multiplaylist.dailymotion.model.DailymotionModel;
import com.transteven.multiplaylist.dailymotion.service.DailymotionService;

import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("api/")
public class DailymotionController {
    @Autowired
        DailymotionService dmService;

    @PostMapping(value="/playlist/add/dailymotion")
    public DailymotionModel createDailymotion(@RequestBody DailymotionModel dm) {
        return dmService.createDailymotion(dm);
    }


    @GetMapping(value="/playlist/add/dailymotion")
        public List<DailymotionModel> readDailymotion() {
        return dmService.getDailymotion();
    }


    @PutMapping(value="/playlist/add/dailymotion/{dmId}")
        public DailymotionModel readDailymotion(@PathVariable(value = "dmId") Long id, @RequestBody DailymotionModel dmDetails) {
        return dmService.updateDailymotion(id, dmDetails);
    }


    @DeleteMapping(value="/playlist/add/dailymotion/{dmId}")
        public void deleteDailymotion(@PathVariable(value = "dmId") Long id) {
        dmService.deleteDailymotion(id);
    }
}
