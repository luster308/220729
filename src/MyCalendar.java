import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyCalendar {
	static GregorianCalendar gc = new GregorianCalendar();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year: ");
		int year = sc.nextInt();
		System.out.print("Month: ");
		int month = sc.nextInt();
		int day = 1;
		int sum = 0;
		
		for(int i=1;i<year;i++) {
			if(year%400==0||year%4==0&&year%100!=0) {    // i가 윤년입니까?
				sum += 366;   // i가 윤년이라면
			}else {
				sum += 365;   // i가 윤년이 아니라면
			}
			
		} // 작년 12월 31일까지의 합
		
		for(int i=1;i<month;i++) {
			sum += getLastDay(year, i);
		}   // 올해 6월까지의 합
		sum++;   // 6월 마지막 날 다음 날
		int space = sum % 7;
		
		System.out.println("	     <<<"+year+"년, "+month+"월>>>");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		//첫 주 공백 출력하는 달력
		int count = 0;
		for(int i=0;i<space;i++) {
			System.out.print("★\t");
			count++;
		}
		//첫 주 1일부터 마지막 날까지 출력하는 달력
		int lastDay = getLastDay(year, month);
		for(int i=1;i<=lastDay;i++) {
			System.out.print(i+"\t");
			count++;
			if(count%7==0) System.out.println();
		}
		
//		switch(sum%7) {
//			case 0: System.out.println("Sun"); break;
//			case 1: System.out.println("Mon"); break;
//			case 2: System.out.println("Tue"); break;
//			case 3: System.out.println("Wed"); break;
//			case 4: System.out.println("Thu"); break;
//			case 5: System.out.println("Fri"); break;
//			case 6: System.out.println("Sat"); break;
//		}
		
	}//main() 끝
	
	static int getLastDay(int year, int month) {   // 년도와 월을 입력받아서 그 달 마지막 일을 넘겨주는 메소드
		int lastDay = 0;
		if(month==2) {   // 2월이라면
			if(gc.isLeapYear(year)) lastDay = 29;   // 2월인데 윤년이면
			else lastDay = 28;   // 2월인데 윤년이 아니면
		}else if(month!=2) {   //2월이 아니라면
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				lastDay = 31;
			else lastDay = 30;
			}
		return lastDay;
		}
	}//class()끝


