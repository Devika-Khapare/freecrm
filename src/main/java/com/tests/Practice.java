package com.tests;

public class Practice {
//    public static void main(String[] args) {
//        //Initialize array
//        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
//        //Array fr will store frequencies of element
//        int [] fr = new int [arr.length];
//        int visited = -1;
//        for(int i = 0; i < arr.length; i++){
//            int count = 1;
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                    //To avoid counting same element again
//                    fr[j] = visited;
//                }
//            }
//            if(fr[i] != visited)
//                fr[i] = count;
//        }
//
//        //Displays the frequency of each element present in array
//        System.out.println("---------------------------------------");
//        System.out.println(" Element | Frequency");
//        System.out.println("---------------------------------------");
//        for(int i = 0; i < fr.length; i++){
//            if(fr[i] != visited)
//                System.out.println("    " + arr[i] + "    |    " + fr[i]);
//        }
//        System.out.println("----------------------------------------");
        //Initialize array
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
//        System.out.println("Duplicate elements in given array: ");
//        //Searches for duplicate element
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j])
//                    System.out.println(arr[j]);
//            }
//        }
        public static int getSecondLargest(int[] a, int total){
            int temp;
            for (int i = 0; i < total; i++)
            {
                for (int j = i + 1; j < total; j++)
                {
                    if (a[i] > a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            return a[total-2];
        }
        public static void main(String args[]){
            int a[]={1,2,5,6,3,2};
            int b[]={44,66,99,77,33,22,55};
            System.out.println("Second Largest: "+getSecondLargest(a,6));
            System.out.println("Second Largest: "+getSecondLargest(b,7));
        }


}
