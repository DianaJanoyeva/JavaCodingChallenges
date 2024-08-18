package JavaReplitHomework;

public class OrderNumber2 {
	
	public static String orderNumber(String message) {
		String orderNumber = "";
		
		for(int i=0; i<=message.length()-1; i++) {
			if(message.charAt(i) ==':') {
				int index = i+1;
				orderNumber = message.substring(index);
			}
		}
		System.out.println(orderNumber);
		return orderNumber;
	}
	

	public static void main(String[] args) {
/*In your application that you are testing when a customer orders products they are given an order number. As a tester you need to
  get the order number for some testing. However there is a challenge in getting the order number since the order number is present in a
  a string that takes different forms.
  Example:
  Your order number is:19382984928492. Check out is complete order number is:934892384928492. Order:984783748728472
  Thanks for the order keep this number handy:382892847287428. Your goal is to design a method that can accept a string and return the orderNumber.
  Example:
  Input: "Your order number is: 19382984928492". Output: "19382984928492"
  Input: "Check out is complete order number is: 934892384928492"
  Output: "934892384928492"*/
		
		OrderNumber2.orderNumber("Your order number is:19382984928492");
		
		
		

	}

}

