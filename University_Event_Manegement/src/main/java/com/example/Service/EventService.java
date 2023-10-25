package com.example.Service;

import com.example.Model.Event;
import com.example.Repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepo iEventRepo;

    public String addEvent(Event event) {
        iEventRepo.save(event);
        return "Event added successfully..";
    }


    public String updateEvent(Integer id, LocalDate date) {
        Optional<Event> getEvent = iEventRepo.findById(id);
        Event event = null;
        if(getEvent.isPresent()){
            event = getEvent.get();
        }else{
            return "Event doesn't exists..";
        }
        event.setDate(date);
        iEventRepo.save(event);
        return "Event date successfully changed";
    }

    public String deleteEvent(Integer id) {
        iEventRepo.deleteById(id);
        return "Event successfully deleted..";
    }

    public List<Event> getAllEventsByDate(LocalDate date) {
        return iEventRepo.findByDate(date);
    }
}

