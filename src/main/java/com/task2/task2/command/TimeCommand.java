package com.task2.task2.command;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCommand implements Command{
    @Override
    public String getNameCommand() {
        return "Time Command";
    }

    @Override
    public String resultCommand() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }
}
