package org.example.part6.stack;

import java.util.ArrayList;

public class Stack {

    static void main() {
//        Stack s = new Stack();
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        s.add("Value");
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        String taken = s.take();
//        System.out.println(s.isEmpty());
//        System.out.println(s.values());
//        System.out.println(taken);


        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }


    public ArrayList<String> list;

    public Stack(){
        this.list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void add(String value){
        list.add(value);
    }

    public ArrayList<String> values(){
        return list;
    }

    public String take(){
        String a = list.get(list.size() - 1);
        list.remove(a);
        return a;
    }

}
