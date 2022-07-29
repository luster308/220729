
public class DoWhileDemo {

	public static void main(String[] args) {
		//1~10까지 출력
		for(int i=1;i<11;i++) {   //초기값, 조건, 증감
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("==================================");
		
		int j =1;   //초기값
		while(j<11) {   // 조건
			System.out.print(j+"\t");
			j++;   // 증감
		}
		System.out.println();
		System.out.println("==================================");
		
		int k = 1;   // 초기값
		do{
			System.out.print(k+"\t");
			k++;   // 증감
		}while(k<11);   // 조건
	}

}
