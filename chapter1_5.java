import java.util.Scanner;
public class chapter1_5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		if(age > 0) {
			int red = age/10;
			int red1 = age%10;
			int blue = red1/5;
			int yellow = red1%5;
			int total = red + blue + yellow;
			String result = "";
            if (red > 0) {
                result += "빨간 초 " + red + "개";
            }
            if (blue > 0) {
                if (!result.isEmpty()) result += ", ";
                result += "파란 초 " + blue + "개";
            }
            if (yellow > 0) {
                if (!result.isEmpty()) result += ", ";
                result += "노란 초 " + yellow + "개";
            }
            System.out.println(result + ". 총 " + total + "개가 필요합니다.");
		}
		else {
			System.out.print("나이는 양수로만 입력하세요.");
		}
		
	}
}
