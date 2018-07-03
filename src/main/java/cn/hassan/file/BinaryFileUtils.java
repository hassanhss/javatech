package cn.hassan.file;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Author: hassan
 * Date: 2018/7/3 22:31
 * Description:
 */
public class BinaryFileUtils {

    public static void copy(InputStream input, OutputStream output) throws IOException {
        byte[] buf = new byte[4096];
        int bytesRead;
        while ((bytesRead = input.read(buf)) != -1) {
            output.write(buf, 0, bytesRead);
        }
    }

    public static byte[] readFileToByteArray(String fileName)
            throws IOException {
        InputStream input = new FileInputStream(fileName);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            copy(input, output);
            return output.toByteArray();
        } finally {
            input.close();
        }
    }

    public static void writeByteArrayToFile(String fileName, byte[] data) throws IOException {
        OutputStream output = new FileOutputStream(fileName);
        try {
            output.write(data);
        } finally {
            output.close();
        }
    }
}
