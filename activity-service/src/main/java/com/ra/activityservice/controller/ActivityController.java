package com.ra.activityservice.controller;

import com.ra.activityservice.model.UserActivity;
import com.ra.activityservice.service.ActivityProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityProducerService producerService;

    @PostMapping
    public ResponseEntity<String> postActivity(@RequestBody UserActivity activity) {
        producerService.sendActivity(activity);
        return new ResponseEntity<>("Activity sent to Kafka", HttpStatus.CREATED);
    }
}
