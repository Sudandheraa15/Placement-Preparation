// I give you a string containing lowercase letters only, your task is to find the typographically smallest string not present as a substring in it.

// Now I give you a 2 string S1 and S2. S1 is smaller than S2 if only:

// |S1|<|S2|

// |S1|=|S2| and S1 is smaller than S2

// Input format :
// The first line of input contains the string S.

// Output format :
// Answer as stated above.

// Code constraints :
// 1 <= |S| <= 105



// Sample test cases :
// Input 1 :
// saurabh
// Output 1 :
// c



// Solution


import java.util.*; 
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine(); 
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                System.out.println(ch);
                return;
            }
        } 
        HashSet<String> set = new HashSet<>(); 
        for (int i = 0; i < s.length() - 1; i++) {
            set.add(s.substring(i, i + 2));
        } 
        for (char a = 'a'; a <= 'z'; a++) {
            for (char b = 'a'; b <= 'z'; b++) { 
                String str = "" + a + b; 
                if (!set.contains(str)) {
                    System.out.println(str);
                    return;
                }
            }
        }
    }
}

