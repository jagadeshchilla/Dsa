package strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        // Test case 1: Common prefix exists
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1)); // Output: "fl"

        // Test case 2: No common prefix
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2)); // Output: ""

        // Test case 3: One string only
        String[] strs3 = {"single"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs3)); // Output: "single"

        // Test case 4: All strings are the same
        String[] strs4 = {"test", "test", "test"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs4)); // Output: "test"

        // Test case 5: Some strings are empty
        String[] strs5 = {"", "b", "c"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs5)); // Output: ""

        // Test case 6: Strings with no letters in common
        String[] strs6 = {"apple", "banana", "cherry"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs6)); // Output: ""
    }

    private String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i< strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
