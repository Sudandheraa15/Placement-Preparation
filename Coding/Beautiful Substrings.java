// A string is special if it has an equal number of a,b,and c in it. 

// Example “abc” , “aabbcc” , “dabc” , “” are special.

// Given a string you need to output the number of non empty beautiful sub-string of the string.
//  Input format : 
// First line consists of a line containing a string a length L.(only lowercase alphabets).
//  Output format :
// Output a single line containing the number of beautiful sub-string. 
// Code constraints : 
// 1<=L<=100000 
// Sample test cases :
// Input 1 :
// abacbcba
// Output 1:
// 5
// Input 2 : 
// dbacd
// Output 2 : 
// 6

// Solution:

import java.util.*; 
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int a = 0, b = 0, c = 0;
        long count = 0; 
        HashMap<String, Integer> map = new HashMap<>(); 
        map.put("0,0", 1); 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
            if (ch == 'a')
                a++;
            else if (ch == 'b')
                b++;
            else if (ch == 'c')
                c++; 
            int x = a - b;
            int y = a - c; 
            String key = x + "," + y; 
            if (map.containsKey(key)) {
                count += map.get(key);
            } 
            map.put(key, map.getOrDefault(key, 0) + 1);
        } 
        System.out.println(count);
    }
}
