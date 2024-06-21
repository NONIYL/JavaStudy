package example;

public class arry2 {
	
public static int[] getLottoset() {
	
	int[] Wnum = new int[7];
	for(int i = 0; i < Wnum.length; ++i) {
		Wnum[i] = (int)(Math.random() * 45 + 1);
		
		for (int j = 0; j < i; ++j) {
			if (Wnum[j] == Wnum[i]) {
				--i;
				break;
				
			}
		}
	
}
	
	return Wnum;
}

 public static void main(String[] args) {
	 System.out.print(getLottoset());

 }
}
