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
// 