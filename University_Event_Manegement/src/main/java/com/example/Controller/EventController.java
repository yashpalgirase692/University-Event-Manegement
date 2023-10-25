package com.example.Controller;

import com.example.Model.Event;
import com.example.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping("event")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }
    @PutMapping("event/id/{id}/date/{date}")
    public String updateEvent(@PathVariable Integer id , @PathVariable LocalDate date){
        return eventService.updateEvent(id , date);
    }
    @DeleteMapping("event/id/{id}")
    public String deleteEvent(@PathVariable Integer id){
        return eventService.deleteEvent(id);
    }
    @GetMapping("events/date/{date}")
    public List<Event> getAllEventsByDate(@PathVariable LocalDate date){
        return eventService.getAllEventsByDate(date);
    }
}
