package t_quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Jiphap {

	public static Set<Integer> union(Collection<Integer> a, Collection<Integer> b) {

		a.addAll(b);
		Set<Integer> union = new HashSet<>(a);

		return union;
	}

	public static void main(String[] args) {
		List<Integer> num1 = new ArrayList<>();
		List<Integer> num2 = new ArrayList<>();

		num1.add(1);
		num1.add(2);
		num1.add(3);

		num2.add(2);
		num2.add(3);
		num2.add(4);
		num2.add(5);

		Set<Integer> unionResult = union(num1, num2);

		System.out.println(unionResult);

	}

}
