package ch01;

/*public class ByteTestError {

	public static void main(String[] args) 
	{
		byte a = 128;
		System.out.println("128을 저장한 byte 값은: "+a);
		
		// TODO Auto-generated method stub
	}
} 
값의 범위를 벗어나면 오류 발생*/


public class ByteTestError {
	public static void main(String args[])
	{
		byte a = (byte)128;
		System.out.println("128을 저장한 byte 값은: "+a);
		byte b = (byte)256;
		System.out.println("256을 저장한 byte 값은: "+b);
	}
}
