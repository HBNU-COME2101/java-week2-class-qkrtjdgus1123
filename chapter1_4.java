import java.util.Scanner;
public class chapter1_4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("여행지: ");
		String place = sc.next();
		System.out.print("인원수: ");
		int num = sc.nextInt();
		System.out.print("숙박일: ");
		int num2 = sc.nextInt();
		System.out.print("1인당 항공료: ");
		int price = sc.nextInt();
		System.out.print("1방 숙박비: ");
		int price2 = sc.nextInt();
		
		int roomNum = (num/2) + (num%2);
		int finalPrice = (price * num) + (roomNum * price2 * num);
		
		System.out.println(num + "명의 " + place + " " + num2 + "박 " + (num2 + 1) + "일 여행에는 " + roomNum + "개 필요하며 경비는 " + finalPrice + " 원입니다.");
	}
}
