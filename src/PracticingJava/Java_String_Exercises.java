package PracticingJava;

public class Java_String_Exercises {

	public static void main(String[] args) {
		/*Write a Java program to get the character at the given index within the string.
	Sample Output:
	Original String = Java Exercises!                                                                             
The character at position 0 is J                                                                              
The character at position 10 is i*/
		String str = "Java Exercises";
		System.out.println("Original String = " + str);
		
		int index1 = str.charAt(0);
		int index2 = str.charAt(10);
		
		System.out.println((char)index1);
		System.out.println((char)index2);
		
		/*Write a Java program to get the character (Unicode code point) at the given index within the string.
		Sample Output:
		Original String : w3resource.com                                                                              
	Character(unicode point) = 51                                                                                 
	Character(unicode point) = 101 */
	
		String str1 = "w3resource.com";
		System.out.println(str1);
		
		int val1 = str1.codePointAt(1);
		int val2 = str1.codePointAt(9);
		System.out.println(val1);
		System.out.println(val2);
	
	}

}