package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    public void put(Task task) {
        var index = 0;
        for (Task element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                tasks.add(index, task);
                break;
            }
            ++index;
        }
        if (index == tasks.size()) {
            tasks.add(index, task);
        }
    }
    public void showTasks() {
        for (Task element : tasks) {
            System.out.println(element.getDesc() + " " + element.getPriority() + System.lineSeparator());
        }
    }
    public Task take() {
        return tasks.remove(0);
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        var task1 = new Task("task1", 4);
        var task2 = new Task("task2", 7);
        var task3 = new Task("task3", 8);
        var task4 = new Task("task4", 3);
        var task5 = new Task("task5", 6);
        var task6 = new Task("task6", 2);
        var task7 = new Task("task7", 1);
        var task8 = new Task("task8", 5);
        pq.put(task1);
        pq.put(task2);
        pq.put(task3);
        pq.put(task4);
        pq.put(task5);
        pq.put(task6);
        pq.put(task7);
        pq.put(task8);
        pq.showTasks();
    }
}
