package JavaReplitHomework;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class OrderNumber {
	
	static String returnOrderNumber(String input) {
		String orderNumber = input.substring(input.indexOf(':')+1, input.length());
		return orderNumber;
	}
	
	
	static String returnOrderNumber2(String str2) {
			
	        String result = str2.replaceAll("\\D", "");
	        return result;
	}
	
	  
	  public static void main(String[] args) {

		 String str2 = "Check out is complete order number is:934892384928492";
		 System.out.println(returnOrderNumber2(str2));
		 
		 System.out.println(returnOrderNumber("Your order number is:1938298492849"));
		 
	  }

	  
	}