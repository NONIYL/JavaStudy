package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E07_copy {
	/*
	//폴더의 경로를 전달하면 같은 경로에 폴더 이름2를 만들고
	//안의 모든 내용을 복사해주는 메서드를 만들어보세요
	
	//ex1> dog 폴더의 경로를 전달하면 안에 있는 모든 강아지 사진이 복사된 dog2 폴더가 생겨야 함
	//ex2> myimage 폴더의 경로를 전달하면 내부의 모든 내용이 그대로인 myimage2가 생겨야함
	
	public static void copy(String path) {
		
		//String dest = path + "2"; //원래 경로에 2를 붙이면 목적지의 경로! 
		//원래 경로에 들어있는 파일들의 목록을 꺼낸다!
		String[] files = new File(path).list();
		
		for(String file: files) {
			FileReader in = new FileReader(file);
			FileWriter out = new FileWriter(dest와 file을 적절히 잘 사용한 경로);
			
			//읽은 후 읽은 내용을 그대로 원하는 위치에 다시쓰면 복사가 된다
			in으로 읽고
			out으로 쓰면 복사 완료!
			
		}
	}
	
	*/

	public static void copy(String path) throws IOException {

		File f1 = new File("myfiles/animal");
		String dest = ("myfiles/animal" + "2");
		String[] files = new File(path).list();

		for (String flie : files) {

			FileReader in = null;
			try {
				in = new FileReader("myfiles/animal");
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
		FileReader out = null;
		try {
			out = new FileReader("myfiles/animal");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

	}
}