package rules;
import java.util.Scanner;;
public class Main {
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TestJalan jalan = new TestJalan();
		Sensor sensor = new Sensor();
		color warna = new color();
		System.out.print("Masukan Warna Goal : ");
		String input = sc.nextLine();
		
		jalan.jalanBenar(input);
		
	
	}

}
