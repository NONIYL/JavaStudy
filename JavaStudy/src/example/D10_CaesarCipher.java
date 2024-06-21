package example;

public class D10_CaesarCipher {
	    String cryptSet;

	    public D10_CaesarCipher() {
	        cryptSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+" 
	                 + "abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	    }

	    public D10_CaesarCipher(String cryptSet) {
	        this.cryptSet = cryptSet;
	    }

	    // 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
	    String encrypt(String plain, int key) {
	        StringBuilder result = new StringBuilder();

	        int len = plain.length();
	        int len2 = cryptSet.length();

	        // 키 값이 너무 크면 의미가 없으므로 사이즈를 줄일 수 있다
	        key = key % len2;

	        for (int i = 0; i < len; ++i) {
	            // 문자를 하나씩 꺼낸다
	            char ch = plain.charAt(i);

	            // 암호표에서 해당 문자의 위치를 찾는다
	            int index = cryptSet.indexOf(ch);

	            // 만약 -1이 나왔다면 암호표에 존재하지 않는 문자이므로 그대로 유지
	            // 인덱스가 -1이 아니라면 암호표에서 키값만큼 더한 문자를 가져와서 추가
	            if (index != -1) {
	                result.append(cryptSet.charAt((index + key) % len2));
	            } else {
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	    // 암호문과 키값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
	    String decrypt(String crypto, int key) {
	        StringBuilder result = new StringBuilder();

	        int len = crypto.length();
	        int len2 = cryptSet.length();

	        // 키 값이 너무 크면 의미가 없으므로 사이즈를 줄일 수 있다
	        key = key % len2;

	        for (int i = 0; i < len; ++i) {
	            char ch = crypto.charAt(i);

	            int index = cryptSet.indexOf(ch);

	            if (index != -1) {
	                // key값으로 뺐는데 결과가 음수인 경우와 양수인 경우를 처리한다
	                int target = index - key;

	                if (target < 0) {
	                    target += len2;
	                }

	                result.append(cryptSet.charAt(target));
	            } else {
	                result.append(ch);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        D10_CaesarCipher cipher1 = new D10_CaesarCipher();

	        // 몇 칸 움직여야 하는가 = key값
	        int key = 10;

	        String plainText = "한글, abc, 123.";
	        String encrypted = cipher1.encrypt(plainText, key);
	        System.out.println("암호화한 결과: " + encrypted);

	        String decrypted = cipher1.decrypt(encrypted, key);
	        System.out.println("복호화 결과: " + decrypted);
	    }
	}



