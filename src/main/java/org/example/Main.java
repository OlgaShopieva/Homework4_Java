package org.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
         //ex1();
        //ex2();
        //ex3();

    }
    static void ex1(){
        /*
        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
         */
        LinkedList<Integer> list1 = new LinkedList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("Исходный список: " + list1);
        System.out.println("Перевёрнутый список: " + reverseList(list1));

    }
    public static LinkedList<Integer> reverseList (LinkedList<Integer> linkedList)
    {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = linkedList.size()-1; i > -1; i--) {
            reversedList.add(linkedList.get(i));
        }
        return reversedList;
    }
    static void ex2() {
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
        MyQueue myQueue = new MyQueue();
            myQueue.enqueue(1);
            myQueue.enqueue(2);
            myQueue.enqueue(3);
            myQueue.enqueue(4);
            myQueue.enqueue(5);
        System.out.println(myQueue);
        System.out.println("Первый элемент очереди: " + myQueue.first());
        myQueue.dequeue();
        System.out.println("Первый элемент очереди после удаления: " + myQueue.first());



    }

    static void ex3() {
        /*
        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
        Используйте итератор.
         */
        LinkedList<Integer> list = new LinkedList<>();
            list.add(6);
            list.add(1);
            list.add(1);
            list.add(1);
            list.add(1);

        System.out.println("Исходный список: " + list);

        int sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            Integer integer = iterator.next();
            sum += integer;
        }
        System.out.println("Сумма элементов списке: " + sum);
    }
}