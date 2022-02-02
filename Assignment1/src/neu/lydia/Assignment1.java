package neu.lydia;

import java.util.Arrays;

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
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    //Q3

    public boolean isDuplicate(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    //Q4

    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        return Arrays.equals(cs, ct);
    }

    //Q5

    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;

    }

    //Q6

    public float telephoneBills(int calls) {
        float bills;
        int i = calls / 50;
        switch (i) {
            case 0:
                bills = 200;
                break;
            case 1:
                bills = 200;
                break;
            case 2:
                bills = 200 + (calls - 100) * 0.6f;
                break;
            case 3:
                bills = 200 + 50 * 0.6f + (calls - 150) * 0.5f;
                break;
            default:
                bills = 200 + 50 * 0.6f + 50 * 0.5f + (calls - 200) * 0.4f;

        }
        return bills;
    }

    //Q7

    public boolean isConstructed(String ransomNote, String magazine) {
        int[] letter = new int[26];
        int temp;
        for (int i = 0; i < magazine.length(); i++) {
            temp = magazine.charAt(i) - 'a';
            letter[temp]++;
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            temp = ransomNote.charAt(j) - 'a';
            if (letter[temp] > 0) {
                letter[temp]--;
            } else return false;
        }
        return true;
    }

    //Q8

    public char gradeTable(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Deficient");
                break;
            case 'F':
                System.out.println("Failing");
            default:
                break;
        }
        return grade;
    }

    //Q9


    public class Book {
        String name;
        int bookID;
        String genres;
        double price;

        public Book(String n, int id, String g, double p) {
            this.name = n;
            this.bookID = id;
            this.genres = g;
            this.price = p;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBookID() {
            return bookID;
        }

        public void setBookID(int bookID) {
            this.bookID = bookID;
        }

        public String getGenres() {
            return genres;
        }

        public void setGenres(String genres) {
            this.genres = genres;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    //Q10

    public class Box {
        double width;
        double height;
        double depth;

        public Box(double w, double h, double d) {
            this.width = w;
            this.height = h;
            this.depth = d;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getDepth() {
            return depth;
        }

        public void setDepth(double depth) {
            this.depth = depth;
        }

        public double boxVolume(){
            return width*height*depth;
        }
    }


}
