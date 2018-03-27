package com.hongzhou.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hongzhou.boot.domain.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
