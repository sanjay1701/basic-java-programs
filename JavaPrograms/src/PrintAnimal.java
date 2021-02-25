
public class PrintAnimal {

	private static void print(int num) {

		if(num%32==0) {
			System.out.println("ANIMAL");
		}if(num%16==0) {
			System.out.println("ANIM");
		}if(num%8==0) {
			System.out.println("AN");
		}

	}

	public static void main(String[] args) {
		int num = 24;
		print(num);
	}
}
