package com.codechef;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	/*
	java program to check, that the given two strings are anagram or not:
	 */
    Scanner sc = new Scanner(System.in);
    String s1;
    String s2;
    int count=0;
    s1 = sc.next();
    s2 = sc.next();
    char[] ch1 = s1.toCharArray();
    char[] ch2 = s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(ch1.length==ch2.length){
        for(int i=0;i< ch1.length;i++){
            if(ch1[i]==ch2[i]){
                count++;
            }
        }
    }
    if(count==ch1.length){
        System.out.println("given string is an anagram");
    }
    else{
        System.out.println("given string is not an anagram");
    }
    }
}
