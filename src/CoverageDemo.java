
public class CoverageDemo {

	public static void main(String[] args) {
		coverThis(50);
		
	}
	
	public static int coverThis(int x) {
		int y = 0;
		
		if(x < 100) {
			y = y + 1;
		}
		
		return x/y;
		
	}
}
