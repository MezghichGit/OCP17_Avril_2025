package day14_11052025;

import java.io.*;

public class CopyFileSample {
    public static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("D:\\OCP\\OCP17_Avril_2025\\src\\Zoo_en.java");
        File destination = new File("D:\\OCP\\OCP17_Avril_2025\\src\\Zoo_en_copy.java");
        copy(source, destination);
    }
}
