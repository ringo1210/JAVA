package ch01;

public class LogicError {
	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		int i = 300;
		int j = 500;
		j += i + j ;
		System.out.println("합계는 ="+ j);
	}
}*/

//작성자의 의도는 j = i + j 인데 잘못 기술됨
		
		int i = 300;
		int j = 500;
		j = i+j;  
		System.out.println("합계는 =" j);
	}
}