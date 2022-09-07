import java.util.Scanner;


public class TestFilm {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Film[] film= new Film[10];
		
		
		for(int i = 0;i<4;i++) {
			
			System.out.print("film:   ");
			String s1 =sc.next();
			System.out.print("Length: ");
			String s=sc.next();
			
		}
		
		
		Film maximumLength= film[0];
		Film minimumLength=film[0];
		for(int i =0;i<film[i].getLengthOfFilm();i++) {
			if(film[i] >maximumLength) {
				film[i]=maximumLength;
				System.out.print("Longest film is "+film[i]);
				
			}else if(film[i] <maximumLength) {
				film[i]=minimumLength;
				System.out.print("Shortest film is "+film[i]);
				
			}
		}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	

}
