import java.util.Scanner;

public class ForDemo1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단?: ");
//		int dan = sc.nextInt();
//		for(int i=1;i<10;i++) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//		}

//		for(int i=5;i>0;i--) {   //밑으로 반복
//			for(int j=1;j<=i;j++) {   // 옆으로 반복
//			System.out.print("★\t");
//		}
//			System.out.println();
//		}

//		for(int i=65;i<=90;i++) {
//			for(int j=65;j<=i;j++) {
//			char ch = (char)j;
//			System.out.print(ch);
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t\t", j, i, i * j);
			}
			System.out.println();
		}
	}

}
