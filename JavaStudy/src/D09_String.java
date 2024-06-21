import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D09_String {

	public static void main(String[] args) {
		String fruits = "apple/banana/orange/kiwi";

		// "".split(delimitter) : 문자열을 원하는 문자를 기준으로 자른 배열을 반환
		String[] fruitArr = fruits.split("/");

		System.out.println(Arrays.toString(fruitArr));
		for (String fruit : fruitArr) {
			System.out.println(fruit);
		}
		System.out.println("==============================");

		// String.join(delim, iterable)
		// : iterable(하나씩 꺼낼 수 있는) 객체를 원하는 기준으로 모두 이어붙인 하나의 문자열을 생성한다
		List<String> zoo = new ArrayList<>();

		zoo.add("코끼리");
		zoo.add("사자");
		zoo.add("호랑이");

		String result = String.join("#", zoo);
		System.out.println(result);
		result = String.join("###", fruitArr);
		System.out.println(result);

		System.out.println("==============================");
		// "".charAt(index): 원하는 위치의 문자 하나를 반환 받는다
		// (String은 문자 하나만 꺼내는 것은 가능하지만, 문자를 수정하는 것은 불가능하다)
		System.out.println("ABC".charAt(0));

		// "".contains(str): 원하는 문자열이 포함되어 있는지 체크한다
		System.out.println("Pineapple".contains("apple"));

		System.out.println("==============================");

		// "".starsWith(str): 해당 문자열이 전달한 문자열로 시작하는지 확인한다
		String url = "http://naver.com";
		System.out.println(url.startsWith("https://"));

		// "".endsWith(str): 해당 문자열이 전달한 문자열로 끝나는지 확인한다
		String path = "C:\\programe filles\\Java\\tiger.jpg";
		System.out.println(path.endsWith(".jpg"));
		System.out.println(path.endsWith(".gif"));

		System.out.println("==============================");

		// "".replace(old, new): 해당 문자열의 일부를 교체한다
		String email = "abc123@naver.com";
		String gmail = email.replace("naver", "gmail");
		String microsoft = email.replace("naver", "microsoft");

		System.out.println(gmail);
		System.out.println(microsoft);

		System.out.println("==============================");

		// "".substring(index): 해당 문자열을 원하는 위치부터 자른 인스턴스를 반환
		String alphabet = "accdefghijklmnop";

		System.out.println(alphabet.substring(5));

		// "".substring(start, end)
		// 해당 문자열을 start이상 end미만으로 자른 문자열 인스턴스를 반환
		System.out.println(alphabet.substring(0, 8));
		System.out.println(alphabet.substring(3, 6));

		System.out.println(alphabet.substring(0, 10));
		System.out.println(alphabet.substring(10));

		System.out.println("==============================");

		// "".trim(): 문자열 외곽의 공백을 제거한 인스턴스를 반환한다
		String answer = "사과";
		String userInput = " 사과       ";
		String userInput2 = "사 과  ";

		System.out.println(userInput2);
		System.out.println(userInput2.trim());
		// replace()를 활용해서 내부의 공백까지 제거할 수 있다
		System.out.println(userInput2.replace(" ", ""));

		System.out.println(answer.equals(userInput));
		System.out.println(answer.equals(userInput.trim()));

		System.out.println("==============================");

		// "".toUpperCase(): 해당 문자열을 모두 대문자로 변환한 새 인스턴스를 반환
		// "".toLowerCase(): 해당 문자열을 모두 소문자로 변환한 새 인스턴스를 반환
		String cmd = "quit";
		String usercmd = "Quit";

		System.out.println(cmd.equals(usercmd));
		System.out.println(cmd.equals(usercmd.toLowerCase()));

		// "".indexOf(str): 해당 문자열에서 전달한 문자열을 찾아서 해당 위치를 반환
		// 문자열을 찾지 못한 경우에는 -1을 반환한다
		String text = "I like apple and applepie." + "I like apple and applepie." + "I like apple and applepie."
				+ "I like apple and applepie." + "I like apple and applepie.";

		System.out.println(text.indexOf("apple"));
		System.out.println(text.indexOf("pizza"));

		// "".indexOf(str, start): 문자열을 어디서부터 찾기 시작할건지 결정할 수 있다
		System.out.println(text.indexOf("apple", 10));

		System.out.println("==============================");

		// 연습: 반복문을 활용하여 위의 text에서 모든 'e'의 위치를 찾아 콘솔에 출력
		// 모든 알파벳 "ap"의 위치를 찾아 콘솔에 출력

		int count = 0; // 여기 count는 사실 갯수를 세지 않기 때문에 필요없음. 갯수셀때는 필요!
		int len = 0;
		while (len > -1) {
			++count;
			len = text.indexOf("e", len + 1);
			System.out.println(len);

		}
		
		System.out.println("==============================");
		
		
		int found = text.indexOf("ap");
		System.out.println("찾은 곳: " + found);

		while (found != -1) {
			found = text.indexOf("ap", found + 1);

			if (found == -1) {
				System.out.println("더 이상 찾을 수 없습니다.");
			} else {
				System.out.println("찾은 곳: " + found);
			}
			
		}
		System.out.println("==============================");
	

		//쌤이 했는데 안찾아짐. 일단 위에거 이해하라고 그냥 넘어감
		int found1 = -1;
		while (true) {
			found1 = text.indexOf("ap", found + 1); 
			if (found == -1) {
				break;
			}
			System.out.println("찾은 곳!!: " + found1);
		}
	
		
		//"".lastIndexOf(str): 원하는 문자열을 뒤에서부터 찾아준다
		System.out.println(text.lastIndexOf("ap"));
		
		//"".lastIndexOf(str, start): 원하는 지점부터 찾기 시작할 수 있다
		System.out.println(text.lastIndexOf("ap", 94));
		
		//String.format(fmt, values...):
		String timeStr = String.format("%02d:%02d:%02d", 7, 15, 35);
		System.out.println(timeStr);
		
		String value1 = "" + 12345;
		String value2 = String.valueOf(12345);
		
		System.out.println(value1 + value2);
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
	}

}
