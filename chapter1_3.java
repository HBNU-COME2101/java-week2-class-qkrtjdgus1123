import java.util.Scanner;
public class chapter1_3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생일 입력 하세요: ");
		int birth = sc.nextInt();
        int year = birth / 10000;
        int month = (birth / 100) % 100;
        int day = birth % 100;
        System.out.println(year + "년 " + month + "월 " + day + "일");
	}
}
