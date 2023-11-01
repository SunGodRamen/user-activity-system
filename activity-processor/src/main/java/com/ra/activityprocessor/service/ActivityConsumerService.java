package com.ra.activityprocessor.service;

import com.ra.activityprocessor.model.UserActivity;
import com.ra.activityprocessor.repository.UserActivityRepository;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ActivityConsumerService {

    // If you need to persist the activity, inject the repository or service here
    @Autowired
    private UserActivityRepository userActivityRepository;

    @KafkaListener(topics = "user_activity", groupId = "activity_processor_group")
    public void consume(UserActivity activity, ConsumerRecord<String, UserActivity> record) {
        // Process the activity data. For simplicity, we're just logging it.
        System.out.println("Consumed activity: " + activity);

        // If you want to save it to the database, you can do so here
        userActivityRepository.save(activity);
    }
}
