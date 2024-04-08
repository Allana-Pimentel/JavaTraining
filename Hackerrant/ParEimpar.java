package Hackerrant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class ParEimpar {







    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());


        if (N >= 1 && N < 6 && N % 2 == 0) {
            System.out.print("Not Weird");
        } else if (N >= 5 && N < 21 && N % 2 == 0) {
            System.out.print("Weird");
        } else if (N >= 20 && N < 101 && N % 2 == 0) {
            System.out.print("Not Weird");
        } else {
            System.out.print("Weird");
        }
        bufferedReader.close();
    }
}
