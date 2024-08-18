package JavaReplitHomework;

public class JavaReplit6 {

int numberOfHomeWorkAssignments;
	
	public void getDetails() {
		System.out.println("Values");
		
	}
	
	public JavaReplit6() {
		this.numberOfHomeWorkAssignments = 1;
	}
	
	
	
	public static void main(String[] args) {
		
		String[] fruits = {"green", "red", "green", "green", "red", "green", "red", "red"};
		int green = 0;
		int green1 = 0;
		
		for(int i = 0; i <= fruits.length-1;i++) {
			if(fruits[i].equals("green")) {
				green++;
			}
		}
		System.out.println("I have " + green + " green apples");
	
		for(String apple: fruits) {
			if(apple.equals("green")) {
				green1++;
			}
		}
		System.out.println("I have " + green1 + " green apples" );
	
	}

}
