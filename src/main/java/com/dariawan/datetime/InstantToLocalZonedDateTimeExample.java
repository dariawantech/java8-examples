package com.dariawan.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantToLocalZonedDateTimeExample {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("Local DateTime from Instant: " + localDateTime);
        
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println("Zoned DateTime from Instant: " + zonedDateTime);
    }
}
