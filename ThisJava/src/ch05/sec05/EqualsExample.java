package ch05.sec05;

public class EqualsExample {

	private static Object StrVar1;
	private static Object strVar2;

	public static void main(String[] args) {
		
		String strVar1 = "홍길동";
		String srtVar2 = "홍길동";
		
		if(StrVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
			
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
			
		}
		
		
		if (strVar1.equals(srtVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
	}
	
}
