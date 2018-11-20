import java.util.ArrayList;
import java.util.List;

public class Demo {
	static int x = 4;

	public Demo() {
		Demo();
		System.out.println("no "+this.x);
		Demo();
		
	}

	public static void Demo() {
		System.out.println("static "+x);
		
	}	

	public static void main(String... strings) {
		new Demo();
	}

}