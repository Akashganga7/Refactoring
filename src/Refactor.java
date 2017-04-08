import java.util.Enumeration;

public class Refactor {
	private MyCollection orders = new MyCollection();
	private String name = "Customer name";
	
	void printOwing()
	{
		Enumeration<E> e = orders.elements();
		double outstanding = 0.0;
		
		//print banner
		printBanner();
		
		// calculate outstanding
		outstanding = calculateOutstanding(e, outstanding);
		
		// print details 
		
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);

	}

	public double calculateOutstanding(Enumeration<E> e, double outstanding) {
		while(e.hasMoreElements())
		{
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
			
		}
		return outstanding;
	}

	private void printBanner() {
		System.out.println("*****************************");
		System.out.println("****** Customer Owes ********");
		System.out.println("*****************************");
	}
	

}
