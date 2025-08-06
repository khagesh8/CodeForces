import java.util.Scanner;
public class BeautifulMatrix263A{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] arr = new int[5][5];
		int indxI = 0, indxJ = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 1){
					indxI= i+1;
					indxJ=j+1;
				}
			}
		}
		indxI = indxI -3;
		indxJ = indxJ -3;
		if(indxI<0) indxI = indxI * (-1);
		if(indxJ<0) indxJ = indxJ * (-1);
		System.out.println(indxI+indxJ);
	}
}