package com.task2.task2.command;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateCommand implements Command{
    @Override
    public String getNameCommand() {
        return "Date Command";
    }

    @Override
    public String resultCommand() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(formatter);
    }
}
