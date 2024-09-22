package strings;

import java.util.Scanner;

public class IsomorphicStrings {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for s and t strings
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter string t: ");
        String t = sc.nextLine();

        // Create an instance of Solution class and call the isIsomorphic method
        IsomorphicStrings solution = new IsomorphicStrings();
        boolean result = solution.isIsomorphic(s, t);

        // Output the result
        System.out.println("Are the strings isomorphic? " + result);
    }

    private boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()) return false;

        int[]maps=new int[128];
        int[] mapt=new int[128];
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);

            if(maps[cs]==0|| mapt[ct]==0){
                maps[cs]=ct;
                mapt[ct]=cs;
            } else if (maps[cs]!=ct||mapt[ct]!=cs) {
                return  false;
            }
        }
        return true;
    }
}
