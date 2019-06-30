package Decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

public class JavaIOTest {
	@SuppressWarnings("resource")
	@Test
	public void test() throws IOException {
        System.out.println("===== FileReader 讀取檔案 ====");
        FileReader reader = new FileReader("test.txt");
        int c = reader.read();
        while (c >= 0) {
            System.out.println((char) c);
            c = reader.read();
        }

        System.out.println("=== BufferedReader 讀取檔案 ===");
        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        System.out.println("=== Reverse Reader 反轉讀取 ===");
        ReverseReader reverseReader = new ReverseReader(new FileReader("test.txt"));

        String rLine = reverseReader.reverseLine();
        while (rLine != null) {
            System.out.println(rLine);
            rLine = reverseReader.reverseLine();
        }
	}
}


class ReverseReader extends BufferedReader {

	public ReverseReader(Reader in) {
		super(in);
	}

	public String reverseLine() throws IOException {
		String line = super.readLine();
		if (line == null) {
			return null;
		}
		return reverse(line);
	}

	private String reverse(String source) {
        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result = source.charAt(i) + result;
        }
        return result;
	}
}