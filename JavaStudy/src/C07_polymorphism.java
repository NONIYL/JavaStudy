
public class C07_polymorphism {
/*
 	# 객체의 다형성
 	
 	- 객체가 다양한 형태를 지닐 수 있다는 성질
 	- 강아지는 강아지이기도 하고 동물이기도 하다
 	  (강아지는 동물이다(o), 동물은 강아지다(x))
 	- 아메리카노는 아메리카노이기도 하고 커피이기도 하다
 	  (아메리카노는 커피이다(o), 커피는 아메리카노이다(x))
 	- 자식 클래스 인스턴스는 부모 클래스 타입의 변수에 대입될 수 있다
 	
 	# 업 캐스팅
 	
 	- 자식 타입 인스턴스가 부모 타입이 되는 것
 	- 자식 타입은 아무 문제 없이 부모 타입이 될 수 있다
 	- 업캐스팅 된 상태에서는 자식 클래스였을때 가지고 있던 기능은 사용할 수 없다
 	- 자식클래스 인스턴스가 업캐스팅 된 상태에서 
 	  오버라이딩된 메서드(자식클래스에서 마음대로 개조한 메서드를 )를 
 	  사용하는 경우 자식 클래스의 메서드가 실행된다
 	
 	# 다운 캐스팅 
 	
 	- 부모 타입은 일반적으로 자식 타입이 될 수 없다 //커피를 늘려서 바닐라라떼로 만들 수 없다, 울프를 늘려서 강아지로 만들 수 없다.
 	- 업캐스팅되었던 자식 클래스의 인스턴스만이 다시 원래의 타입으로 돌아올 수 있다
      (원래 강아지였던 인스턴스만 다시 강아지로 돌아올 수 있다) 
 	
 	# instanceof 연산자
 	
 	- 해당 인스턴스가 특정 클래스의 인스턴스인지 검사해주는 연산자
 	- 결과는 true/false로 알려준다 
 */
	public static void pet(Wolf wolf) {
		wolf.pet();
	}
	
	public static void hunt(Wolf wolf) {
		System.out.println(wolf.name + "와 함께 맘모스를 사냥했습니다!!");
		
	}
	
	
	public static void main(String[] args) {
		//자식 클래스 인스턴스들은 부모 타입 변수에 저장이 가능하다
		Americano a1 = new Americano();
		Coffee c1 = new Americano();
		Coffee c2 = new CafeLatte();
		Coffee c3 = a1;
		
		//업캐스팅 되고 나면 Dog타입에만 존재하는 메서드인 walk()를 사용할 수 없다
		//하지만 Wolf타입에도 함께 존재하는 메서드는 사용할 수 있다
		Dog dog1 = new Dog();
		Wolf dog2 = new Dog();
		
		dog1.walk();
//		dog2.walk(); //업캐스팅 되어서 사용 불가능
		
		dog1.pet();
		dog2.pet(); //오버라이딩된 메서드는 업캐스팅 되더라도 자식클래스의 것으로 동작한다
		
		dog1.run();
		dog2.run();
		
		//Wolf타입이 되었던 Dog인스턴스를 다시 Dog로 변환하는 것은 가능하다
		Dog d3 = (Dog)dog2;
		d3.walk();
		
		//업캐스팅된 상태로도 해당 클래스의 인스턴스인지 검사가 가능하다
		Wolf wolf1 = new Dog();
		Wolf wolf2 = new Wolf();
		
		System.out.println("wolf1은 강아지인가요?" + (wolf1 instanceof Dog));
		System.out.println("wolf2은 강아지인가요?" + (wolf2 instanceof Dog));
		
//		ex >
//			Americano[] as = {
//			new 빽사이즈아메리카노(),
//			new 핫아메리카노(),
//			new 아이스아메리카노(),
//			new 커피() // 얘는 아메리카노보다 더 큰 범위라 들어올 수 없는것임
//		};
		
		Wolf[] wolves = { 
				new Wolf(),
				new Dog(),
				new Wolf(),
				new Dog("몽실이")
		};
		
		for (int i = 0; i < wolves.length; ++i) {
			System.out.println(wolves[i] instanceof Dog); //도그의 인스턴스를 확인해주는 연산자
		}
		
		//wolf타입 매개변수에는 wolf타입이 될 수 있는 모든것을 전달할 수 있다
		hunt(wolf1);
		hunt(wolf2);
		hunt(new Dog("몽실이")); //결과적으로 도그는 울프아래 상속을 받았기에 가능함
		
		pet(wolf1);
		pet(wolf2);
	}
}

class Coffee {}
class Americano extends Coffee {}
class CafeLatte extends Coffee {}
