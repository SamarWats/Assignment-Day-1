package com.music.streaming.platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.PlayListService;
import com.music.streaming.platform.service.TrackService;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {
    @Autowired
    private TrackService service;
    
    public TrackController(TrackService service) {
    	super();
    	this.service=service;
    }
    
    @PostMapping
    public Track createTrack(@RequestBody TrackRequest request) {
//        Artist saved = service.createArtist(request);
//        return new ResponseEntity<>(saved, HttpStatus.CREATED);
        return service.createTrack(request);
    }

    @GetMapping
    public ResponseEntity<List<Track>> getAllTracks() {
        return new ResponseEntity<>(service.getAllTracks(), HttpStatus.OK);
    }

    @GetMapping("/{trackId}")
    public ResponseEntity<Track> getTrackById(@PathVariable Long trackId) {
        Track track = service.getTrackById(trackId);

        if (track != null) {
            return new ResponseEntity<>(track, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{trackId}")
    public ResponseEntity<Track> updateTrack(@PathVariable Long trackId, @RequestBody TrackRequest request){
        Track updated = service.updateTrack(trackId, request);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{trackId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrack(@PathVariable Long trackId) {
        service.deleteTrack(trackId);
    }
    
}
