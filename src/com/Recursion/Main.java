package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Java program to check that the string is palindrome or not:
        String str = "nitin";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        for(int i=0;i<str.length();i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }
            return true;
        }
        return false;
    }
}
// start will iterate the string from index 0 to last index:
// end will iterate the string from last index to index 0:
// in every step it will compare start and end, will compare it in each iteration.
// will return true if its palindrome and false if its not.