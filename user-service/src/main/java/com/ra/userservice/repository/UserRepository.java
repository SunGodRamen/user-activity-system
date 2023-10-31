package com.ra.userservice.repository;

import com.ra.userservice.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import java.util.UUID;

public interface UserRepository extends CassandraRepository<User, UUID> {
}
