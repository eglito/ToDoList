package org.example;

public class Main {
    public static void main(String[] args) {

        ToDo taskList = new ToDo();

        taskList.addTask("escola","colocar tinta no canetao");
        taskList.addTask("escola","nova tesk");
        taskList.addTask("escola","montar prova bimestral");
        taskList.addTask("academia","comprar creatina");


        System.out.println(taskList.toString());


    }
}