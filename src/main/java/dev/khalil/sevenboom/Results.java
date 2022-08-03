package dev.khalil.sevenboom;

public class Results {
	
	public String sevenBoom(int intArray[]) {
		
		Boolean sevenflag = false;
		
		for(int isSeven : intArray) {
			if(isSeven == 7) {
				sevenflag = true;
				break;
			}
		}
		
		if(sevenflag) {
			return "Boom!";
		}
		else {
			return "there is no 7 in array";
		}
	}

	public static void main(String[] args) {
		
		Results res = new Results();
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		String output = res.sevenBoom(numbers);
		System.out.println(output);
		

	}

	


}
