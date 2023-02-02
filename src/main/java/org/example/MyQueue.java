package org.example;

import java.util.LinkedList;

/*
 Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди,
 dequeue() - возвращает первый элемент из очереди и удаляет его,
 first() - возвращает первый элемент из очереди, не удаляя.
  */
public class MyQueue {
    private LinkedList<Integer> list;

    MyQueue() {
        list = new LinkedList<>();
    }

    void enqueue(int element) {
        list.addLast(element);

    }

    int dequeue() {
        int item = list.getFirst();
        list.removeFirst();
        return item;
    }

    int first(){
        return list.getFirst();

    }

    public String toString() {
        return "Очередь: " + list;
    }
}

