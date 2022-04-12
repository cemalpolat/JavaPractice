package day23_CustomsMethod_Void;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Anagram {
    public static void main(String[] args) {


        anagram("kalp", "plak");
    }



   public static void anagram(String a, String b){


   String [] arr1  = a.split("");
   String [] arr2  = b.split("");

   Arrays.sort(arr1);
   Arrays.sort(arr2);

   if( Arrays.equals(arr1,arr2)){

       System.out.println(a + " and " + b + " are anagram");
   }else{
       System.out.println(a + " and " + b + " are not anagram");

   }







   }





}
