public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 64; i++) {
			if((i%2) == 0) {
				if((i%2) != 0)
					System.out.print(i + "\t");
				else
					System.out.print(i + "\t");
			} else {
				if(i%2 == 0)
					System.out.print(i + "\t");
				else
					System.out.print(i + "\t");
			}
			
			if(i%8 == 0)
				System.out.println("\n");
		}

	}
}