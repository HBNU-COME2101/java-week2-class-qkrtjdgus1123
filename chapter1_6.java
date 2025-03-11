import java.util.Scanner;
public class chapter1_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("(x1, y1), (x2, y2)의 좌표 입력: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);
        if (minX >= 10 && maxX <= 200 && minY >= 10 && maxY <= 300) {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (10, 10) (200, 300) 사각형에 포함된다.");
        } else {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + ", " + y2 + ") 사각형은 (10, 10) (200, 300) 사각형에 포함되지 않는다.");
        }
    }
}
