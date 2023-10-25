package com.example.Repository;

import com.example.Model.Event;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface IEventRepo extends CrudRepository<Event, Integer> {
    List<Event> findByDate(LocalDate date);
}