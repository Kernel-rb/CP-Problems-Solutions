import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = s.split("[^A-Za-z]+");
            System.out.println(arr.length);
            for (String token : arr) {
                System.out.println(token);
            }
        }

        scan.close();
    }
}

