package com.music.streaming.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.ArtistService;
import com.music.streaming.platform.service.PlayListService;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {
    @Autowired
    private PlayListService service;
    
    public PlayListController(PlayListService service) {
    	super();
    	this.service=service;
    }
    
    @PostMapping
    public PlayList createPlayList(@RequestBody PlayListRequest request) {
      return service.createPlayList(request);
    }
    
    @GetMapping("/{playListId}")
    public ResponseEntity<PlayList> getPlayListById(@PathVariable Long playListId) {

        PlayList playlist = service.getPlayListById(playListId);

        if (playlist != null) {
            return new ResponseEntity<>(playlist, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{playListId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePlayList(@PathVariable Long playListId){
        service.deletePlayList(playListId);
    }
    
}
