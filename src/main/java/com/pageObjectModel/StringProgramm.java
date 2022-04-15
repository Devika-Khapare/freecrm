package com.pageObjectModel;


//Programm to remove duplicate & print only unique value form the string
public class StringProgramm {

    public static void main(String[] args){
        String str1 = "Good ", str2 = "morning ";
        System.out.println("Strings before swapping: " + str1 + " " + str2);

        //Concatenate both the string str1 and str2 and store it in str1
        str1 = str1 + str2;
        //Extract str2 from updated str1
        str2 = str1.substring(0, (str1.length() - str2.length()));
        //Extract str1 from updated str1
        str1 = str1.substring(str2.length());

        System.out.println("Strings after swapping: " + str1 + " " + str2);

    }


    public void  printuniquew(){
        int cnt;

        String str = "Hello World";
        for(int i=0;i<str.length();i++){
            cnt=1;
            String str1 = String.valueOf(str.charAt(i));
            char ch1[] = str.toCharArray();
               for(int j=1;j<str.length();j++){
                   if(String.valueOf(str.charAt(j)).equalsIgnoreCase(str1)){
                       cnt=0;
                       //ch1[j]='0';
                   }
               }
               if(cnt==1){
                   System.out.println(str1);
               }
        }

    }
}

