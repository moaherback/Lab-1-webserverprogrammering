package com.example.timecity;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeService {
    String getTimeByCity(String city) {
        if (city.equalsIgnoreCase("Stockholm")) {
            return LocalDateTime.now().toString();
        } else if (city.equalsIgnoreCase("Bangkok")) {
            return LocalDateTime.now().plusHours(6).toString();
        }  else if (city.equalsIgnoreCase("Hawaii")) {
            return LocalDateTime.now().minusHours(11).toString();
        } else {
            return "I do not know what time it is in " + city;
        }
    }
}