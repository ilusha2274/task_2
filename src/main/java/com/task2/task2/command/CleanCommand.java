package com.task2.task2.command;

public class CleanCommand implements Command{
    @Override
    public String getNameCommand() {
        return "Clean Command";
    }

    @Override
    public String resultCommand() {
        return "";
    }
}
