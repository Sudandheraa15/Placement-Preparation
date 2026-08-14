// Problem:
// A company has N employees. The salary of each employee is given. Write a Java program to find the employee's highest salary.

// Input:
// 5
// 25000 32000 28000 45000 30000

// Output:
// 45000

// Solution

import java.util.*;
public class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int max=arr[0];
  for(int i=0;i<n;i++){
    if(arr[i]>max){
      max=arr[i];
    }
  }
    System.out.println(max);
}
}
