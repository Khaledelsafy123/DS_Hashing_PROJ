import java.util.Arrays;
public class Main {
	
	
	public static void main(String[] args) {
		
		int size = 5;
		int x [] = new int [size];
		int key [] = {7 , 5, 3 , 8 ,2};
		
		for(int i = 0 ; i < key.length; i++) {
			
			int currentKey = key[i];
			int h1 = currentKey % size;
			int h2 = 1 + (currentKey % (size - 1));
			
			boolean inserted = false;
			for(int j = 0 ; j < size ; j++) {
				int probe = (h1 + j * h2) % size;
				
				if(x[probe] == 0) {
					x[probe] = currentKey;
					inserted = true;
					break;
				}
				
			}
			
		}
		
		
		System.out.println(Arrays.toString(x));

		
		
		

		
		

		
		
		
		

	}

}

