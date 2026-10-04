package javaCore5;

import java.util.Scanner;

public class Pizdation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split(" ");
        String[] newLine = new String[line.length/2];
        int index = 0;
        for (int i = 0; i < line.length; i++) {
            if( i % 2 != 0) {
                    newLine[index] = line[i];
                    index++;
            }
        }
        for (int j = newLine.length-1; j >=0; j--) {
            System.out.print(newLine[j] + " ");
        }
    }
}
