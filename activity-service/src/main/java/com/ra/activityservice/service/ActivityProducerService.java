package com.ra.activityservice.service;

import com.ra.activityservice.model.UserActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ActivityProducerService {

    @Autowired
    private KafkaTemplate<String, UserActivity> kafkaTemplate;

    private static final String TOPIC_NAME = "user_activity";

    public void sendActivity(UserActivity activity) {
        kafkaTemplate.send(TOPIC_NAME, activity);
    }
}
