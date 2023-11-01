package com.ra.activityprocessor.repository;

import com.ra.activityprocessor.model.UserActivity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserActivityRepository extends CassandraRepository<UserActivity, UUID> {
}
