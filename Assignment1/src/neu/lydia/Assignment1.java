package neu.lydia;

public class Assignment1 {

    public static void main(String[] args) {
        // write your code here

    }


    //Q1

    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



    //Q2

    public boolean hasAllUniqueChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i))){
                return false;
            }
        }
        return true;
    }


    //Q3

    public boolean isDuplicate(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i))){
                return true;
            }
        }
        return false;
    }

}
