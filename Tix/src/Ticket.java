/**
 * Week 1 Homework
 * An app that writes a ticket for an event using Sting,double, char, and int 
 * and then prints the ticket.
 * CIS 2272
 * @author Matthew Beane
 *
 */
public class Ticket 
{

	public static void main(String[] args) 
	{
		String event = "Beyonce";
		double ticketPrice = 75.50;
		char seatRow = 'J';
		int seatNumber = 32;
		
		System.out.println("********\nTICKET" + "\n" + event + "\n$" + ticketPrice + "\nSeat " + seatRow + "-" + seatNumber + "\n********");

	}

}
