package com.nick.ws_project.controller;

import com.nick.ws_project.model.WeatherModel;
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
                .baseUrl("https://api.weatherbit.io/v2.0/current").build();
        this.apiService = apiService;
    }

    @GetMapping("/{city}")
    public Mono<WeatherModel> getCityWeather(@PathVariable String city) {
        String apiKey = apiService.getApiKey();
        return weatherWebClient.get()
                .uri(UriBuilder -> UriBuilder
                        .queryParam("city", city)
                        .queryParam("key", apiKey)
                        .build())
                .retrieve()
                .bodyToMono(WeatherModel.class);

    }
}