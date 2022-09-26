package com.transteven.multiplaylist.dailymotion.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value="/playlist/dm", method=RequestMethod.POST)
    public DailymotionModel createDailymotion(@RequestBody DailymotionModel dm) {
        return dmService.createDailymotion(dm);
    }


    @RequestMapping(value="/playlist/dm", method=RequestMethod.GET)
        public List<DailymotionModel> readDailymotion() {
        return dmService.getDailymotion();
    }


    @RequestMapping(value="/playlist/dm/{dmId}", method=RequestMethod.PUT)
        public DailymotionModel readDailymotion(@PathVariable(value = "dmId") Long id, @RequestBody DailymotionModel dmDetails) {
        return dmService.updateDailymotion(id, dmDetails);
    }


    @RequestMapping(value="/playlist/dm/{dmId}", method=RequestMethod.DELETE)
        public void deleteDailymotion(@PathVariable(value = "dmId") Long id) {
        dmService.deleteDailymotion(id);
    }
}
