package com.foxmula.assignment_2;

import java.util.Scanner;
import java.util.*;


class Stack{

    private LinkedList<Integer>  ll1= new LinkedList<>();
    private int top;
    private boolean empty;

    public int getTop() {
        top=ll1.getLast();
        return top;

    }



    public void push(int n){

        ll1.addLast(n);



    }

    public boolean isEmpty(){

        empty=ll1.isEmpty();
        if(empty==true)
        {
            System.out.println("Stack is Empty");
        }
        return empty;

    }

    public char pop(){

        if(!isEmpty())
        {

            int temp= ll1.removeLast();
            return (char)temp;
        }

        else
            return 'e';




    }


    public int size()
    {
        return ll1.size();
    }


}


