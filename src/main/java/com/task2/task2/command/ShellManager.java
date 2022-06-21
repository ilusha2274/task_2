package com.task2.task2.command;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShellManager implements IShellManager{

    @Autowired
    private Command dateCommand;
    @Autowired
    private Command timeCommand;
    @Autowired
    private Command cleanCommand;

    @Override
    public List<String> getListCommand() {
        List<String> list = new ArrayList<>();
        list.add(dateCommand.getNameCommand());
        list.add(timeCommand.getNameCommand());
        list.add(cleanCommand.getNameCommand());
        return list;
    }

    @Override
    public String chekCommand(String string) {
        String res = "";
        switch (string){
            case "Дата":
            case "Date":
            case "Date Command": res = dateCommand.getNameCommand() + " - команда для вывода даты.\n" +
                    "Сейчас: " + dateCommand.resultCommand();
            break;
            case "Время":
            case "Time":
            case "Time Command": res = timeCommand.getNameCommand() + " - команда для вывода времени.\n" +
                    "Сейчас: " + timeCommand.resultCommand();
            break;
            case "очистить":
            case "Clean":
            case "Clean Command": res = cleanCommand.resultCommand();
            break;
            default: res = "Такой команды нет! (Кнопка 'Список команд' может тебе помочь).";
            break;
        }
        return res;
    }
}
