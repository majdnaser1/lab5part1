package day5;

import java.util.Scanner;

public class calculater {

    public static void main(String []args){

        Scanner in=new Scanner(System.in);

        System.out.println("please enter your first number");
        int number1=in.nextInt();

        System.out.println("please enter your first number");
        int number2=in.nextInt();

        System.out.println("please enter your first number");
        String operation=in.next();

        if(operation.equals("+")){
            System.out.println(number1+number2);
        }else if(operation.equals("-")){
            System.out.println(number1-number2);
        }else if(operation.equals("*")){
            System.out.println(number1*number2);
        }else if(operation.equals("/")){
            System.out.println(number1/number2);
        }else if(operation.equals("%")) {
            System.out.println(number1 % number2);
        }else {
            System.out.println("wrong operation");
        }


    }

}
