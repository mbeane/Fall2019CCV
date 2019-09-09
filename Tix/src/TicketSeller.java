/**
 * Week 1 Homework
 * An app that writes a ticket for an event using Sting,double, char, and int 
 * and then prints 20 different tickets using a for loop.
 * CIS 2272
 * @author Matthew Beane
 *
 */
public class TicketSeller
{

	public static void main(String[] args) 
	{
		//Assigning values to parameters
		String event = "Red Sox vs. Yankees";
		double ticketPrice = 120.00;
		char seatRow = 'B';
		int seatNumber;
		//for loop running until seatNumber reaches 42
		for(seatNumber =2; seatNumber <=42; seatNumber++)
		{
			int seatNumberTwo = seatNumber ++;
			System.out.println("********\nTICKET" + "\n" + event + "\n$" + ticketPrice + "\nSeat " + seatRow + "-" + seatNumberTwo + "\n********\n");
		}

	}

}
