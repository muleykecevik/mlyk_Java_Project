package week01;

import java.util.ArrayList;
import java.util.List;

public class P02_dataTypes {
    public static void main(String[] args) {

        String a= "";
        a+=2;
        a+='c';
        a+=false;

        System.out.println(a);

        List<String> list= new ArrayList<>();
        list.add("one");
        list.add("two");


        ArrayList<Integer> values = new ArrayList<>();

        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);
        System.out.println(values);
        String s="Hello";

        String t= new String(s);

        if ("Hello".equals(s)) System.out.println("one");

        if(t==s)System.out.println("two");

        if(t.equals(s)) System.out.println("three");

        if("Hello"==s)System.out.println("four");

        if("Hello"==t)System.out.println("five");





    }
}
