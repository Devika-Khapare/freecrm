package com.tests;

public class NumberProgram {

    public static void main(String[] args){
        NumberProgram num1 = new NumberProgram();
        //reverse of number
        int num = 123;
        if(num<0){
            num = num *-1;
            int rev =num1.revNo(num);
            rev = rev*-1;
            System.out.println(rev);
        }else {
            int rev = num1.revNo(num);
            System.out.println(rev);
        }
        //factorial of number
        num1.factorial();
        //fatorial of num
        System.out.println(num1.factorial(6));


    }

    //Reverse of number
    public int revNo(int num){
        int r ;
        int reverse=0;
        while(num >0){
            r=num%10;
            reverse = reverse*10+r;
            num=num/10;
        }


        return reverse;
    }

    //Factorial of number using for loop
    public void factorial(){
        int i,fact=1;
        int number=5;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

    //Fatorial of number using recursion
    public int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}

