import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E06_Charset {
	
	/*
	 	# Charset
	 	
	 	- ASCII 코드까지는 모든 Charset이 동일하지만 그 이후부터는 각 회사마다 각자가 개발한 문자표를 사용한다
	 	- MS949 : 마이크로소프트의 문자표
	 	- EUC-KR: 이클립스가 기본적으로 사용하는 문자표
	 	- UTF-8: 가장 표준이 되는 문자표로 모든 문자를 포함하고 있어 용량이 크다
	 	- Writer 또는 Reader를 사용할떄 어떤 문자표를 사용하여 byte로 변환/복구 할 것 인지 설정할 수 있다
	 	
	 	인코딩: 문자를 0과 1로 만듦
	 	디코딩: 그걸 받아서 다시 문자로 만듦
	 */
	
	public static void main(String[] args) {
		
		FileWriter out = null;
		try {
		//인스턴스 생성시 문자표를 선택할 수 있는 오버로딩이 있다
		 out = new FileWriter("myfiles/encodingTest.txt", Charset.forName("EUC-KR"));
		
		 //charset: 문자열을 byte로 쪼갤때의 규칙을 정한다
		out.write("한글을 씁니다..\n");
		out.write("한글을 씁니다..\n");
		out.write("한글을 씁니다..\n");
		out.write("한글을 씁니다..\n");
		
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
		FileReader in = null;
		
		try {
			//FileReader를 만들때도 원하는 charset을 설정할 수 있다
			//인코딩할때 EUC-KR를 썼으면 디코딩 할때도 EUC-KR를 써야 깨지지 않는다
			in = new FileReader("myfiles/codingTest.txt", Charset.forName("EUC-KR")); 
		
			//byte단위로 읽은 데이터를 char로 합칠 때 참고할 문자표를 사용한다
			int ch;
			while ((ch = in.read()) != -1) {
				System.out.println(ch);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
