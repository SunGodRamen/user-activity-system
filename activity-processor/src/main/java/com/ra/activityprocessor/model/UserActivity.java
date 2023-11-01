package com.ra.activityprocessor.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table("user_activity")
public class UserActivity {

    @PrimaryKey
    private UUID activityId;

    private UUID userId;
    private String activityType;
    private LocalDateTime activityTimestamp;
    private String activityData;
}
