package javaCore4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            String token = scanner.next();
            try {
                double value = Double.parseDouble(token);
                sum += value;
            } catch (NumberFormatException e) {

            }
        }
        System.out.printf("%.6f", sum);
    }
}
