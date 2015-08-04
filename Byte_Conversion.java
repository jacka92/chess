import java.util.Scanner;

public class Byte_Conversion {

	public static void main(String[] args) {
		
		final String[] UNITS = {
			"B", "KB", "MB", "GB"
		};

		Scanner in = new Scanner(System.in);
		System.out.println("Enter value in bytes.");
		long value = in.nextLong();
		
		if(0<=value && value<1024){
			String result = value + UNITS[0];
			System.out.println(result);
		}
		
		else if(1024<=value && value<1048576){
			double kilobytes = value/1024;
			String result = kilobytes + UNITS[1];
			System.out.println(result);
		}
		
		else if(1048576<=value && value<1073741824){
			double megabytes = value/1048576;
			String result = megabytes + UNITS[2];
			System.out.println(result);
		}
		
		else if(1073741824<=value){
			double gigs = value/1073741824;
			String result = gigs + UNITS[3];
			System.out.println(result);
		}
	}
}
