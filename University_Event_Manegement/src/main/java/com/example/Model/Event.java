package com.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Events")
public class Event {
    @Id
    private Integer eventId;
    private String eventName;
    private String eventLocation;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

}
