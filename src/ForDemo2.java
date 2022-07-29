
public class ForDemo2 {

	public static void main(String[] args) {
		/*
		 * x는 1부터 2씩 증가, y는 100부터 3씩 감소 교차할 때의 x, y의 값은?
		 */
//		int x, y;
//		for (x = 1, y = 100; x < 101; x += 2, y -= 3) {
//			if (x > y)	break;
//		}
//		System.out.printf("x = %d, y = %d",x,y);

		// 1부터 10까지 출력하기
//		int i =1;   // 초기화
//		for( ;i<11; ) {
//			System.out.print(i+"\t");
//			i++;
//		}
////		int y = 1;   // 초기화
////		while(y<11) {
////			System.out.print(y+"\t");
////			y++;
//		}
//		int i = 1;
//		int dan = 2;
//		while(i<=9) {
//			while(dan<=9) {
//				System.out.printf("%d x %d = %d\t", dan, i, i * dan);
//				dan++;
//		}
//			i++;
//			dan =2;
//			System.out.println();
//	}

		int i = 65;
		int count = 0;
		int line = 1;
		while (i < 91) {
			if (line % 2 == 0)
				System.out.printf("%c\t", i + 32);
			else
				System.out.printf("%c\t", i);
			count++;
			if (count % 5 == 0) {
				System.out.println();
				line++;
			}
			i++;
		}

	}
}