package com.openclassrooms.bobapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.openclassrooms.bobapp.service.JokeService;

@RestController
@RequestMapping("api/joke")
public class JokeController {

    private final JokeService jokeService;

    JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping()
    public ResponseEntity<?> getRandomJokes() {
        return ResponseEntity.ok(this.jokeService.getRandomJoke());
    }

     @GetMapping("/github/callback")
    @ResponseBody
    public String handleGithubCallback(@RequestParam("code") String code) {
        // Handle the callback logic here
        // Extract code and exchange it for access token
        // Store the access token securely
        
        return "Callback handled successfully" + code;
    }
}
