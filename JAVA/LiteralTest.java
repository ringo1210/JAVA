package ch01;

public class LiteralTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 0b1100100;
		int c = 0144;
		int d = 0*64;
		
		System.out.println("10진수 100 =" +a);
		System.out.println("2진수 0b1100100 =" + b);
		System.out.println("8진수 0114 =" + c);
		System.out.println("16진수 0x64 =" +d);
		System.out.println("2진수 0b111="+0b111);
		System.out.println("8진수 0777=" +0777);
		System.out.println("16진수 0*fff=" + 0xfff );
		}
}
