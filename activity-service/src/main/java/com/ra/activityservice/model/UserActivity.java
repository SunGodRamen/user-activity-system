package com.ra.activityservice.model;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserActivity {
    private UUID activityId;
    private UUID userId;
    private String activityType;
    private LocalDateTime activityTimestamp;
    private String activityData;
}
