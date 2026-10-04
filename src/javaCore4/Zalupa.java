package javaCore4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class Zalupa {

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int value;
        while ((value = inputStream.read()) != -1) {
            sum = sum + (byte) value;
        }
        return sum;
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int b;
        while ((b = inputStream.read()) != -1) {
            if (b % 2 == 0) {
                outputStream.write(b);
            }
        }
        outputStream.flush();
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        byte[] bytes = inputStream.readAllBytes();
        return new String(bytes, charset);

//        InputStreamReader reader = new InputStreamReader(inputStream, charsetName);
//        StringBuilder sb = new StringBuilder();
//        char[] buffer = new char[1024];
//        int numChars;
//        while ((numChars = reader.read(buffer)) != -1) {
//            sb.append(buffer, 0, numChars);
//        }
//        return sb.toString();
    }
}
