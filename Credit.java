/**
 * @author John Tyler Gafford
 * September 20th 2016
 * jtg2246@email.vccs.edu
 * This program is used to take your card number
 * and tell you what type of card it is
 */

import javax.swing.JOptionPane;
import java.awt.Point;
import javax.swing.JDialog;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class Credit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String card;
		
		//Getting the current screen resolution then setting window to bottom right
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int w = gd.getDisplayMode().getWidth();
		int h = gd.getDisplayMode().getHeight();
		Point location = new Point(w-500, h-538);
		
		//Creating joptionpane input box at point location and size 500x500
		JOptionPane card1 = new JOptionPane("Input Your Credit or Debit Card Number."
				, JOptionPane.PLAIN_MESSAGE
				, JOptionPane.DEFAULT_OPTION
				, null, null, "Input Your Card Number.");
		card1.setWantsInput(true);
		JDialog dialog1 = card1.createDialog(null, "Card");
		dialog1.setLocation(location);
		dialog1.setSize(500, 500);
		dialog1.isAlwaysOnTop();
		dialog1.setVisible(true);
		
		card = (String) card1.getInputValue();
		
		//Regular Expression for Visa card type
		if(card.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
			
			JOptionPane output = new JOptionPane("Your Card Type is Visa."
					, JOptionPane.PLAIN_MESSAGE
					, JOptionPane.DEFAULT_OPTION
					, null, null, "test");
			JDialog dialog2 = output.createDialog(null, "Your Card Type");
			dialog2.setLocation(location);
			dialog2.setSize(500, 500);
			dialog2.isAlwaysOnTop();
			dialog2.setVisible(true);
		}
		
		//Regular Expression for MAstercard card type
		if(card.matches("^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$")) {
			
			JOptionPane output = new JOptionPane("Your Card Type is Mastercard." 
					, JOptionPane.PLAIN_MESSAGE
					, JOptionPane.DEFAULT_OPTION
					, null, null, "test");
			JDialog dialog2 = output.createDialog(null, "Your Card Type");
			dialog2.setLocation(location);
			dialog2.setSize(500, 500);
			dialog2.isAlwaysOnTop();
			dialog2.setVisible(true);
		}
		
		//Regular Expression for Diners Club card type
		if(card.matches("^(?:36[0-9]|38[0-9]|30[0-5])[0-9]{11}$")) {
			
			JOptionPane output = new JOptionPane("Your Card Type is Diners Club." 
					, JOptionPane.PLAIN_MESSAGE
					, JOptionPane.DEFAULT_OPTION
					, null, null, "test");
			JDialog dialog2 = output.createDialog(null, "Your Card Type");
			dialog2.setLocation(location);
			dialog2.setSize(500, 500);
			dialog2.isAlwaysOnTop();
			dialog2.setVisible(true);
		}
		
		//Regular Expression for Discover card type
		if(card.matches("^(?:6011|65[0-9]{2})[0-9]{12}$")) {
			
			JOptionPane output = new JOptionPane("Your Card Type is Discover." 
					, JOptionPane.PLAIN_MESSAGE
					, JOptionPane.DEFAULT_OPTION
					, null, null, "test");
			JDialog dialog2 = output.createDialog(null, "Your Card Type");
			dialog2.setLocation(location);
			dialog2.setSize(500, 500);
			dialog2.isAlwaysOnTop();
			dialog2.setVisible(true);
		}
		
		//Regular Expression for JDB card type
		if(card.matches("^(?:2131|1800|35[0-9]{3})[0-9]{11}$")) {
			
			JOptionPane output = new JOptionPane("Your Card Type is JCB." 
					, JOptionPane.PLAIN_MESSAGE
					, JOptionPane.DEFAULT_OPTION
					, null, null, "test");
			JDialog dialog2 = output.createDialog(null, "Your Card Type");
			dialog2.setLocation(location);
			dialog2.setSize(500, 500);
			dialog2.isAlwaysOnTop();
			dialog2.setVisible(true);
		}
		
		//Regular Expression for American Express card type
		if(card.matches("^(?:34|37)[0-9]{13}$")) {
			
			JOptionPane output = new JOptionPane("Your Card Type is American Express." 
					, JOptionPane.PLAIN_MESSAGE
					, JOptionPane.DEFAULT_OPTION
					, null, null, "test");
			JDialog dialog2 = output.createDialog(null, "Your Card Type");
			dialog2.setLocation(location);
			dialog2.setSize(500, 500);
			dialog2.isAlwaysOnTop();
			dialog2.setVisible(true);
		}
		
		System.exit(0);
		
	}
}
