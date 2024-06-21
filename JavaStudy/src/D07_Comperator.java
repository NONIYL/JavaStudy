import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D07_Comperator {

	/*
	 * # Comparable
	 * 
	 * - 이 인터페이스를 구현한 클래스는 크기 비교가 가능해진다 - compareTo() 메서드를 구현해두면 크기 비교가 필요한 상황에서
	 * 해당메서드를 호출해 크기를 비교할 수 있게 된다
	 * 
	 * # Comparator
	 * 
	 * - 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다 - 이 인터페이스를 구현한 클래스의 인스턴스를 정렬의 기준으로 함께 전달할 수
	 * 있다
	 * 
	 */

	public static void main(String[] args) {
		// Wrapper 클래스들은 Comparable이 이미 구현되어 있으므로 compareTo() 메서드를 직접 구현할 필요가 없다
		// 추상클래스 참고
		List<Integer> nums = new ArrayList<>();
		List<String> countries = new ArrayList<>();

		Collections.addAll(nums, 88, 88, 89, 90, 15, 12, 11, 13, 10, 99);
		Collections.sort(nums);

		System.out.println(nums);

		System.out.println("==================================================");

		List<Grape> grapes = new ArrayList<>();

		grapes.add(new Grape("김씨네농장", 30, 5.8, "A+"));
		grapes.add(new Grape("박씨네농장", 28, 8.1, "B+"));
		grapes.add(new Grape("이씨네농장", 40, 6.5, "A-"));
		grapes.add(new Grape("도씨네농장", 40, 6.5, "C"));
		grapes.add(new Grape("제갈씨네농장", 35, 7.5, "B-"));
		grapes.add(new Grape("남궁씨네농장", 35, 5.4, "A-"));
		grapes.add(new Grape("최씨네농장", 35, 7.7, "A+"));
		grapes.add(new Grape("신씨네농장", 20, 8.8, "B"));

		// sort()를 할 수 있으려면 리스트에 속한 모든 요소들의 Comparable이 구현 되어야 한다
		// Collections.sort(grapes);

		// Comparator를 함께 전달하면 Comparable의 compareTo() 대신
		// Comparator의 compare()를 사용하여 정렬한다
		Collections.sort(grapes, new 포도분류기_당도기준내림차순());
		// Collections.sort(grapes, new Comparator<Grape>());
		// 이 자리에 Comparator를 못쓰는 이유: 인터페이스라 그대로 쓸 수가 x..상속받아야함

		// compartor 구현받은 익명의 분류기를 전달한다
		Collections.sort(grapes, new Comparator<Grape>() {
			@Override
			public int compare(Grape g1, Grape g2) {

				if (g1.sweet == g2.sweet) {
					return 0;
				} else if (g1.sweet > g2.sweet) {
					return 1;
				} else {
					return -1;
				}

			}
		});

		System.out.println(grapes);

		System.out.println("==================================================");

		List<Peach> peachs = new ArrayList<>();

		ArrayList<String> peach = new ArrayList<>();

		peach.add("시벙방농장");
		peach.add("왈왈농장");
		peach.add("쉬펄팍농장");
		peach.add("코리안팤농장");

		System.out.println(peach);

		peachs.add(new Peach("시벙방농장", 8500, "C", 6.5));
		peachs.add(new Peach("왈왈농장", 9500, "B-", 7.5));
		peachs.add(new Peach("쉬펄팍농장", 11000, "A", 5.4));
		peachs.add(new Peach("코리안팤농장", 9800, "B", 8.8));

		Collections.sort(peachs, new Comparator<Peach>() {
			@Override
			public int compare(Peach p1, Peach p2) {

				if (p1.weight == p2.weight) {
					return 0;
				} else if (p1.weight > p2.weight) {
					return 1;
				} else {
					return -1;
				}
			}

		});

		System.out.println(peachs);
	}

}

//comparable 인터페이스를 구현한 클래스는 각 인스턴스끼리의 크기 비교가 가능해진다 -> 정렬이 가능해진다
class Grape implements Comparable<Grape> {
	String farm;
	int qty;
	double sweet;
	String grade;

	public Grape(String farm, int qty, double sweet, String grade) {
		this.farm = farm;
		this.qty = qty;
		this.sweet = sweet;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return String.format(" [%s/%d알/%.1f/%s]\n ", farm, qty, sweet, grade);
	}

	@Override
	public int compareTo(Grape g) {
		// 현재 인스턴스와 매개변수로 전달받은 인스턴스를 비교하였을 때
		// 어떤 것이 더 크다고 판정할 것인지 정해야 한다

		// 두 인스턴스의 크기가 같다 : 0을 리턴
		// 현재 인스턴스의 크기가 더 크다 : 1을 리턴
		// 매개변수 인스턴스의 크기가 더 크다 : -1을 리턴

		// 예시: 포도알의 개수로 두 포도("인스턴스")의 크기를 비교
		if (this.qty == g.qty) {
			// 포도알 개수가 같으면 당도를 기준으로 다시 크기 비교
			if (this.sweet == g.sweet) {
				return 0;
			} else if (this.sweet > g.sweet) {
				return 1;
			} else {
				return -1;
			}

		} else if (this.qty > g.qty) {
			return 1;
		} else {
			return -1;
		}

	}
}

// 내림차순 : 큰게 먼저 나오는 것 
// 오름차순 : 작은게 먼저 나오는 것
class 포도분류기_당도기준내림차순 implements Comparator<Grape> {

	@Override
	public int compare(Grape g1, Grape g2) {
		// 왼쪽것이 더 클 때 (왼쪽 것이 뒤쪽에 나오고 싶을때) : 1
		// 오른쪽 것이 더 클 때 (오른쪽 것이 뒤쪽에 나오고 싶을때): -1
		// 두 인스턴스의 크기가 같을때 : 0
		if (g1.sweet == g2.sweet) {
			return 0;
		} else if (g1.sweet > g2.sweet) {
			return -1;
		}
		return 0;

	}
}

/*
 * 연습1: 복숭아 클래스를 정의해보세요 복숭아는 가격, 등급, 무게, 농장이름을 필드로 가지고 있습니다 (등급은 +, -를 매길 수 있음)
 * 
 * 연습2: 복숭아를 크기 비교가 가능한 객체로 만들어보세요(무게 기준)
 * 
 * 연습3: 복숭아를 리스트에 넣고 등급기준으로 내림차순 정렬하고, 등급이 같은 경우 가격 기준으로 내림차순 정렬해보세요
 * 
 * 연습4: 복숭아를 농장이름순으로 오름차순 정렬하고 농장이름이 같은 경우 등급 기준으로 내림차순 정렬해주세요
 */

class Peach implements Comparable<Peach> {
	String farm;
	int price;
	String grade;
	double weight;

	public Peach(String farm, int price, String grade, double weight) {
		this.farm = farm;
		this.price = price;
		this.grade = grade;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return String.format("[ %s/%d원/%s등급/%.1f]\n", farm, price, grade, weight);
	}

	@Override
	public int compareTo(Peach p) {
		if (this.weight == p.weight) {
		}
		return 0;
	}
}
