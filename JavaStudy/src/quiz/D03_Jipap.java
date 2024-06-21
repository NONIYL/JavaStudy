package quiz;

import java.util.Collection;
import java.util.HashSet;

public class D03_Jipap {
	
	/*
	 	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 set으로 반환하는 메서드
	 	  [1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	 	  
	 	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	 	  [1, 2, 3] 교 [ 2, 3, 4, 5] => [2, 3]
	 	  
	 	  
	 	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	 	[1, 2, 3] - [2, 3, 4, 5] => [1]
	 	[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	 	
	 */
	
	public static void union(  ) {
		
		
	}

	public static void main(String[] args) {
		Collection<Integer> a = new HashSet();
		Collection<Integer> b  = new HashSet();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		b.add(2);
		b.add(3);
		b.add(4);
		b.add(5);
		
		a.addAll(b);
		System.out.println(a);
		System.out.println("==================");
		
		a.retainAll(b);
		System.out.println(a);
		System.out.println("==================");
		
		a.removeAll(b);
		System.out.println(a);
		System.out.println("==================");
		
		
		Collection<Integer> set = new HashSet<>(b);
		
		
		
		

		
	
		
	
		

	}
}
