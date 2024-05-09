package com.openclassrooms.bobapp.controller;

import com.openclassrooms.bobapp.model.Joke;
import com.openclassrooms.bobapp.service.JokeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JokeControllerTest {

    @Mock
    private JokeService jokeService;

    @Test
    public void testGetRandomJokes() {
        // Arrange
        JokeController jokeController = new JokeController(jokeService);
        Joke expectedJoke = new Joke("This is a joke", "This is the punchline");
        when(jokeService.getRandomJoke()).thenReturn(expectedJoke);

        // Act
        ResponseEntity<?> response = jokeController.getRandomJokes();

        // Assert
        assertEquals(ResponseEntity.ok(expectedJoke), response);
    }
} 

