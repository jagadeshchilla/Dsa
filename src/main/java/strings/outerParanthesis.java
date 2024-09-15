package strings;

public class outerParanthesis {
    public static String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int balance=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                if(balance>0){
                    res.append(c);
                }
                balance++;
            }
            else if(c==')'){
                if(balance>1){
                    res.append(c);
                }
                balance--;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "(()())(())()";
        System.out.println(removeOuterParentheses(s1));

        // Example 2
        String s2 = "()()(()())(()())";
        System.out.println(removeOuterParentheses(s2));

        // Example 3
        String s3 = "((()))(())";
        System.out.println(removeOuterParentheses(s3));
    }
}

// This code is contributed by Sundaram

