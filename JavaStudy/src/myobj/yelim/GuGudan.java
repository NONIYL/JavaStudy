package myobj.yelim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GuGudan {

	public static void main(String[] args) {

	FileWriter out = null;
	
	try {
		out = new FileWriter("myfiles/gugudan.txt");
		
		for(int i = 2; i <= 9; ++i) {
			for(int j = 1; j <= 9; ++j) {
				out.write(String.format("%dx%d=%2d  ",i, j, i * j));
			}
			out.write("\n");
		}
		
		out.write("\n");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		FileReader in = null;
		try {
			in = new FileReader("myfiles/gugudan.txt");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
}
			