import javax.swing.JFrame;
/* AUTHOR:	R Grant
 * DATE:	4/2014
 */

public class ReserveRoomApplication 
{

	public static void main(String[] args) 
	{
		ReserveRoomGUI theApp = new ReserveRoomGUI("Reserve Room");
		theApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theApp.setVisible(true);
	}
}
