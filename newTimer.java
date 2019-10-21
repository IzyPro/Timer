import javax.swing.JOptionPane;
public class newTimer {   
	public static void main(String[] args)    {        
		// Set Timer amount
		int timer = 1000; // for each second represents 1000
		boolean isTrue = true; //condition to control the display of message
		// display a message box each second using thread.sleep in try and catch
		try{
			while(isTrue){
				JOptionPane.showMessageDialog(null,"Message is to be shown");
				Thread.sleep(timer);
			}

		} catch(InterruptedException ex){
			//catch
		} 
        
	} 
}

