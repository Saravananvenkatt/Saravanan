package loop;

public class NestLoop {
	public static void main(String[] args) {
int count = 4;		
		
		for (int i = 1; i <=count; i++) {
			
			for (int j = 1; j < i; j++) {
		
				System.out.print(j+" ");
			}
			System.out.println("");
		}
			
	}
}