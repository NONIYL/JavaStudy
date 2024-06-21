import java.util.Arrays;

public class B14_Arry2 {
	
	/*
	 
	 배열도 다른 배열의 요소가 될 수 있다
	 (배열 안에 여러개의 배열이 들어있을 수도 있다)
	 
	 */

	public static void main(String[] args) {
		
		// []인덱스를 따라가면 int가 들어있다
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {1, 1, 1, 1, 1, 1};
		int[] arr3 = new int[8];
		int[] arr4 = new int[] {10, 11, 12, 13};
		
		// int[]을 요소로 가지는 int[][] 
		// int 요소를 가지는 배열의 배열 즉 2차원 배열이라고 함
		int[][] arr5 = {{1, 2, 3},      //0
						{3, 3, 3, 3},   //1
						{5, 5, 5, 1},   //2
						arr1,			//3
						arr2,			//4
						arr3,			//5
						arr4,			//6
		};
						
		//int[]의 값을 인덱스를 통해 꺼내면 int가 나온다
		System.out.println(arr1[3]); //4
		
		// int[][]의 값을 인덱스를 통해 꺼내면 int[]이 나온다
		System.out.println(arr5[0]); //{1, 2, 3}
		System.out.println(arr5[1]); //{3, 3, 3, 3}
		System.out.println(arr5[2]); //{5, 5, 5, 1}
		
		System.out.println(arr5[0][2]); // 3
		System.out.println(arr5[3][2]);	// 3
		System.out.println(arr5[3][5]);	// 6	
		
		//배열의 변수명으로 값을 전달하는 것은
		//해당 변수명이 가리키고 있는 실체(배열)의 위치를 전달하는 것이다
		// 아래 예제에서 javaClass의 실체는 하나이기 때문에
		//school[0][0]을 변경하면 school[0]과 javaClass가 함께 가리키고 있는
		//같은 실체를 변경하게 된다
		int[] javaClass = {30, 44, 70, 99, 80};
		int[] pythonClass = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[][] school = {
				{-5, 44, 70, 99, 80},
				javaClass,
				pythonClass,
		};

		//-5를 지정하지 않았을때 00 값=3
		//그냥 javaClass를 넣으면 -5가 나옴, 왜냠녀 javaClass로 가서
		//의 0번째 자리를 -5로 지정했기 때문임
		//하지만 int[][] school에 javaClass가 아닌 
		//{30, 44, 70, 99, 80}를 넣으면 직관적으로
		//school[0][0] 의 0번 자리는 30이므로 30이 나옴
		school[0][0] = -5;
		
		//-5
		System.out.println("javaClass[0]=" + javaClass[0]); 
		
		/*
		 # 배열이 다른 변수와 다른점
		
		 - 배열타입 변수에는 실제 배열의 메모리상 위치(주소값)이 들어있고
		   인덱스를 통해 해당 주소를 찾아가는 뱡식을 사용한다
	 	   기본형 변수(소문자로 시작하는 변수)는 변수에 그냥값을 넣고 사용한다 > int, string...
		 
		 */
		
		
		//2를 바꿨으니까 1은 안바뀌는게 당연하지
		
		//여기는 'int num1 의 값이 =10 이다' 라고 지정해줬기에, '값'인 10이 그대로 나옴
		int num1 = 10;
		int num2 = num1;
		
		num2 = 99; //위치(주소)가 아니라 그냥 지정값이라 안바뀜
		//사실 이런거지....99(10) <- (10)가 실제값, 변수명은 99인거지..ㅋ
		
		System.out.println(num1);
		
		// 2를 바꿨는데 왜 1이 바뀌지?
		
		// 하지만 여기는 {1, 2, 3, 4, 5}의 값이 scores1에 들어가있고 
		// {1, 2, 3, 4, 5} 라는 주소(실제'위치')가 들어가 있는 것
		// 그 '위치'에 '존재'하는 숫자를 넣어줌. 
		// 값 자체가 들어있다는 게 아님.
		int[] scores1 = {1, 2, 3, 4, 5};
		int[] scores2 = scores1; // a = b, b = 'a={}' 결국 같은값을 가르킴 
				
		scores2[0] = 99; // 시작점에서 0번째 방에 있는 값을 가져와라
		scores2[1] = 99; 
		scores2[2] = 99;
		
		System.out.println(Arrays.toString(scores1));
		
		//n차원 배열은 n중 반복문으로 모든 요소를 탐색할 수 있다
		char[][] negativeMessages = {
				{'H', 'E','l','l'}, 				    //0
				{'G','u','i','l','t','y'},			    //1
				{'D','i','s','a','s','t','e','r'},		//2
				{'s','t','u','p','i','d'},				//3
		};	
		System.out.println("----------------");
		
		char[][] positiveMessages = {
				{'F', 'r','i','e','n','d','s','h','i','p'},    //0
				{'H','a','p','p','y'},			               //1
				{'P','e','r','f','e','c','t'},		           //2
				{'N','i','c','e'},				              //3
				{'G','o','o','d'},				              //4
		};
		
		
		for (int i = 0; i < negativeMessages.length; ++i) {
			for (int j = 0; j < negativeMessages[i].length; ++j) {
				System.out.printf( "[%d][%d]: %c\n",
						i, j, negativeMessages[i][j]);
			}
			System.out.println("----------------");
		}
		// <연습> :messages에 포함된 모든 요소를 반복문으로 하나씩 출력해보세요
		char[][][] messages = { negativeMessages, positiveMessages };

		for (int i = 0; i < messages.length; ++i) {
			for (int j = 0; j < messages[i].length; ++j) {
				for (int k = 0; k < messages[i][j].length; ++k) {
					System.out.printf("[%d][%d][%d]: %c\n", i, j, k, messages[i][j][k]);
				}

			}
		}

	}

}
