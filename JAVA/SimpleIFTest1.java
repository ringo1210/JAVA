package ch01;
import java.util.Scanner;
public class SimpleIFTest1 {
	public static void main(String[] args) 
		// TODO Auto-generated method stub
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력 :");
		int count = stdin.nextInt();
		if (count <0)
			System.out.println(count + "은(는) 음수입니다.");
	}
}

// 입력된 값이 0보다 작은지, 조건문에 해당하는 것을 출력
