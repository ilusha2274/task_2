package com.task2.task2.command;

import java.util.List;

public interface IShellManager {
    List<String> getListCommand();

    String chekCommand(String string);
}
