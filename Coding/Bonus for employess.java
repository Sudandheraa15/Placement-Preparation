//Problem:
//A company gives an annual bonus to employees based on their years of experience.

// Experience ≥ 10 years → 20% bonus
// Experience ≥ 5 years → 10% bonus
// Otherwise → 5% bonus

// Given salary and experience, calculate the final salary after the bonus.
// Input:
// 40000 
// 6

// Output:
// 44000

// Explanation:
// Experience = 6 years → 10% bonus
// 10% of 40000 = 4000
// Final salary:
// 40000 + 4000 = 44000

// Solution:

import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int salary=sc.nextInt();
    int experience=sc.nextInt();
    double bouns;
    if(experience>=10){
       bonus = salary * 0.20;
    }
    else if(experience>=5){
      bonus = salary * 0.10;
    }
    else{
      bouns = salary * 0.05;
    }
    double finalsalary = salary + bonus;
    System.out.println((int) finalsalary);
  }
}
