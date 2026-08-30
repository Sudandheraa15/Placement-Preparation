//  Professor Walter noticed that sometimes integer based programs can also be solved using strings in a very efficient way. 
// So he provided a program like that to his students to solve. The program is: Given a non-negative integer K. 
//  The aim is to identify the shortest even number S such that S > K and digits in K and S are equal.

// Input format :
// The input contains an integer K.

// Output format :
//  Display the required smallest even number. If no such even number exist, then display -1.

// Code constraints :
// 1<=K<=1018﻿
// Sample test cases :
// Input 1 :
// 34722641
// Output 1 :
// 34724126
// Input 2 :
// 111
// Output 2 :
// -1

// Solution

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        while (nextPermutation(arr)) { 
            if ((arr[arr.length - 1] - '0') % 2 == 0) {
                System.out.println(new String(arr));
                return;
            }
        } 
        System.out.println(-1);
    } 
    static boolean nextPermutation(char[] arr) { 
        int i = arr.length - 2; 
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        } 
        if (i < 0)
            return false; 
        int j = arr.length - 1; 
        while (arr[j] <= arr[i]) {
            j--;
        } 
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
        int left = i + 1;
        int right = arr.length - 1;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return true;
    }
}
