package com.nick.ws_project.controller;

import com.nick.ws_project.model.WeatherData;
import com.nick.ws_project.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WebClient weatherWebClient;
    private final ApiService apiService;

    @Autowired
    public WeatherController(WebClient.Builder weatherWebClient, ApiService apiService) {
        this.weatherWebClient = weatherWebClient
                .baseUrl("https://api.tomorrow.io/v4/weather/realtime").build();
        this.apiService = apiService;
    }

    @GetMapping("/{location}")
    public Mono<WeatherData> getCityWeather(@PathVariable String location) {
        String apiKey = apiService.getApiKey();
        return weatherWebClient.get()
                .uri(UriBuilder -> UriBuilder
                        .queryParam("location", location)
                        .queryParam("apikey", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(WeatherData.class);

    }
}