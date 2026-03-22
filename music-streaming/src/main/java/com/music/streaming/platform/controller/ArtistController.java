package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/artists")
public class ArtistController {

    @Autowired
    private ArtistService service;

    @PostMapping
    public Artist createArtist(@RequestBody ArtistRequest request) {
//        Artist saved = service.createArtist(request);
//        return new ResponseEntity<>(saved, HttpStatus.CREATED);
        return service.createArtist(request);
    }

    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtists() {
        return new ResponseEntity<>(service.getAllArtists(), HttpStatus.OK);
    }

    @GetMapping("/{artistId}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long artistId) {

        Artist artist = service.getArtistById(artistId);

        if (artist != null) {
            return new ResponseEntity<>(artist, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{artistId}")
    public ResponseEntity<Artist> updateArtist(@PathVariable Long artistId,
                                               @RequestBody ArtistRequest request) {

        Artist updated = service.updateArtist(artistId, request);

        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    
    @DeleteMapping("/{artistId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrack(@PathVariable Long artistId) {
        service.deleteArtist(artistId);
    }
}