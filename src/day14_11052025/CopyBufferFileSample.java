package day14_11052025;

import java.io.*;

public class CopyBufferFileSample {
    public static void copy(File source, File destination) throws IOException {
        try (
            InputStream in = new BufferedInputStream(new FileInputStream(source));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))
        ) {
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File source = new File("D:\\OCP\\OCP17_Avril_2025\\src\\Zoo_en.java");
        File destination = new File("D:\\OCP\\OCP17_Avril_2025\\src\\Zoo_en_copy_buffer.java");
        copy(source, destination);
    }
}
