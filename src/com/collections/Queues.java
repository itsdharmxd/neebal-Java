package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *  Queue(front) ,Deque(Double end), PriorityQueue(min ,max queue), ArrayBlockingQueue(have a limited size )
 */
public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedBlockingQueue<Integer>();

        queue.add(3);
        queue.add(1);
        queue.add(2);
        queue.add(5);
        queue.add(4);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
        System.out.println("''''''''''''''''''''''");
        Queue<Integer>queue1=new PriorityQueue<Integer>();
        queue1.add(3);
        queue1.add(1);
        queue1.add(2);
        queue1.add(5);
        queue1.add(4);
        while (!queue1.isEmpty()){
            System.out.println(queue1.peek());
            queue1.remove();
        }

   Deque<Integer>deque=new ArrayDeque<>(); // Deque



    }
}
