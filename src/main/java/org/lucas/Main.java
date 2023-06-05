package org.lucas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Arrays;
import java.util.Base64;

public class Main {

    private static final String filepath = "C:\\Windows\\System32\\calc.exe";
    public static void main(String[] args) {
        try {
            InputStream reader = new FileInputStream(filepath);
            byte[] byteBuff = new byte[2];
            int size;
            while ((size = reader.read(byteBuff)) != -1) {
//                String read = new String(byteBuff, 0, size);
                StringBuilder bug = new StringBuilder();

                for (byte b : byteBuff) {
                    bug.append(String.format("%2X", b & 0xFF));

                }
                System.out.print("Byte val : " + bug + " ");
                System.out.println("Encode Val : " + new String(byteBuff, 0, 2));

            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}