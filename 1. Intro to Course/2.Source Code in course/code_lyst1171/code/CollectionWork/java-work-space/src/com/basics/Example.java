package com.basics;

import java.util.*;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(100);

        // list.add(0,600);
        list.addFirst(500);
        //  list.addLast(600);
        System.out.println(list);


        List<String> list1 = new LinkedList<>();



        list1.add("one");
        list1.add("two");
        list1.add("three");
        System.out.println(list1);
        String s = list1.get(1);
        System.out.println(s);


        Vector<Double> list3 = new Vector<>();

        list3.add(2.4);
        list3.add(4.4);
        list3.add(5.5);

        System.out.println(list3);

        Stack<String> stack = new Stack<>();

        stack.push("durgesh");
        stack.push("harsh");
        stack.push("vandna");
        stack.push("roshni");
        stack.push("anshu");

        System.out.println(stack);
        System.out.println(stack.pop());


        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(12);
        queue.offer(100);
        queue.offer(500);
        queue.offer(900);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);


        Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Durgesh");
        deque.offerLast("Harsh");
        deque.offerFirst("Vandna");
        deque.offerLast("anshu");
        System.out.println(deque);

        System.out.println(deque.pollLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);


        LinkedList<String> linkedList=new LinkedList<>();



    }
}
