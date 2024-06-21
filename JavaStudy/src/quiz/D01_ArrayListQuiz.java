package quiz;

import java.util.ArrayList;

public class D01_ArrayListQuiz {
	
	/*
	 	1. 리스트에 1000 ~ 1999 사이의 랜덤 정수를 100개 추가하기
	 	
	 	2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 	
	 	3. 2번의 결과에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> list2 = new ArrayList();
		
		for (int i = 0; i < 100; i++) {
			System.out.println((int)(Math.random() * 1000) + 1000);
			
			list.add(7);
			
			System.out.println(list);
			System.out.println(list.get(i));
		}
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 0; i < list.size(); ++i)
			if(i % 2 == 0) {
				sum += list.size();
//				list.remove(i);
				System.out.println("짝수를 제거하고 남은수: " + sum);
			}
			
		for(int i = 0; i < list.size(); ++i) {
			 if (i % 2 != 0) {
				sum2 += list.size();
//				list.remove(i);
				System.out.println("홀수를 제거하고 남은수: " + sum2);
			 }	
				
			}
			
		}
	}


