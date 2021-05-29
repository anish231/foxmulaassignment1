package com.foxmula.assignment_2;
import java.util.*;

public class MainStack {
    public static void main(String[] args) {


        Stack s1= new Stack();
        Stack s2 = new Stack();


        while(true){
            if(s1.size()==s2.size()&&s1.size()!=0&&s2.size()!=0)
            {
                System.out.println("Number of elements are equal in stack 1 and stack 2 and number of elements= "+ (s2.getTop()+1));
            }

            System.out.println("1. Push in STACK 1");
            System.out.println("2. Push in STACK 2");
            System.out.println("3. Pop from STACK 1");
            System.out.println("4. Pop from STACK 2");
            System.out.println("5. Check if STACK 1 is empty");
            System.out.println("6. Check if STACK 2 is empty");
            System.out.println("7. Exit the program");

            int a;
            Scanner s= new Scanner(System.in);
            System.out.println("\n Enter your choice ");
            int choice = s.nextInt();
            switch(choice){
                case 1:System.out.println("Enter the number to push ");
                    int n= s.nextInt();
                    s1.push(n);
                    break;

                case 2:System.out.println("Enter the number to push ");
                    n= s.nextInt();
                    s2.push(n);
                    break;

                case 3:char c=s1.pop();
                    if(c=='e')
                    {
                        break;
                    }
                    System.out.println((int)c+ " is popped");
                    break;

                case 4:c=s2.pop();
                    if(c=='e')
                    {
                        break;
                    }
                    System.out.println((int)c+ " is popped");
                    break;

                case 5: boolean emp=s1.isEmpty();
                    if(!emp)
                        System.out.println("Stack 1 is not empty");
                    break;

                case 6: emp=s2.isEmpty();
                    if(!emp)
                        System.out.println("Stack 2 is not empty");
                    break;

                case 7: return;



            }



        }
    }
}
