import java.util.Scanner;
public class BeautifulYear {
    static int isDistinct(int l) {
    	++l;
        for (int i = l; true; ++i) {
            int num = i;
            boolean[] visited = new boolean[10];
            while (num != 0) {
                if (visited[num % 10]) {
                    break;
                }
                visited[num % 10] = true;
                num = num / 10;
            }
            if (num == 0) {
                return i;
            }
        }
    }
    public static void main(String[] args) {
        int l = new Scanner(System.in).nextInt();
        System.out.println(isDistinct(l));
    }
}