package t_quiz;

public class D10_CaesarCipher {
	
	/*
 	# 시저(카이사르) 암호
 	
 	- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을 생성하는 
 	  암호 알고리즘
 	  
 	  [표]
 	  
 	  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+
 	  abcdefghijklmnopopqrstuvwxyz {}[]|\;:'"/?<>,.
 	  
 	  *암호화 
 	  
 	  (평문)			   key:3			(암호문)
 	  HELLO!	-------------------->   KHOOR!
 	  
 	  *복호화
 	 		   		   key:3
 	  HELLO!	<--------------------   KHOOR!
 	  
 	  
 	 */
	

	String cryptSet;
	
	public D10_CaesarCipher() {
		cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+" 
			 	 + "abcdefghijklmnopopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	}
	
	public D10_CaesarCipher(String cryptSet) {
		this.cryptSet = cryptSet;
	}

	//1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
	String encrypt(String plain, int key) {
		StringBuilder result = new StringBuilder();
		
		int len = plain.length();
		int len2 = cryptSet.length();
		
		key = key % len2;
		
		for (int i = 0; i <len; ++i) {
			//문자를 하나씩 꺼낸다
			char ch = plain.charAt(i);
			
			//암호표에서 해당 문자의 위치를 찾는다
			int index = cryptSet.indexOf(ch);
			
			//만약 -1이 나왔다면 암호표에 존재하지 않는 문자이므로 그대로 유지
			//인덱스가 -1아 아니라면 암호표에서 키값만큼 더한 문자를 가져와서 추가
			if (index != -1) {
				result.append(cryptSet.charAt(index + key) % len2);
			} else {
				result.append(ch);
			
			}
		}
		
		return result.toString();
		
	}
	

	//2. 암호문과 키값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
	//※ 사용할 수 있는 문자의 종류: 영어 대/소문자, 숫자, 특수문자
	String decrypt(String crypto, int key) {
		StringBuilder result = new StringBuilder();
		
		int len = crypto.length();
		int len2 = cryptSet.length();
		
		//어자피 키 값이 너무 커봤자 의미가 없는 알고리즘이기 때문에 사이즈를 줄일 수 있다
		key = key % len2; 
		
		for( int i = 0; i < len; ++i) {
			char ch = crypto.charAt(i);
			int index = cryptSet.indexOf(ch);
			
			//"ABCDEFG"
			// 전체길이: 7
			// 키 값은 7 이상이어봤자 의미가 없다 
			// △ 아래 내용임▼ 
			
			
			if (index != -1) {
				//key값으로 뺐는데 결과가 음수인 경우와 양수인 경우를 처리한다
				int target = index - (key % len2);
				
				if (target < 0) {
					result.append(cryptSet.charAt(len2 + target));
				} else {
					result.append(cryptSet.charAt(target));
				}
				
			} else {
				result.append(ch);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		D10_CaesarCipher cipher1 = new D10_CaesarCipher();
		
		//몇칸 움직여야 하는가 = key값
		int key = 10;
		
		String encrypted = cipher1.encrypt("한글, abc, 123.", key);
		System.out.println("암호화한 결과: " + encrypted);
		
		String decrypted = cipher1.decrypt(encrypted, key);
		System.out.println("복호화 결과: " + decrypted);
	}
	
	
}
