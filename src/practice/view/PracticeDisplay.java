package practice.view;

import javax.swing.JOptionPane;

/**
 * Simple GUI class usingJOptionPane
 * @author Wyatt Miller
 * @version 1.0 10.03.2017
 */
public class PracticeDisplay
{
	/**
	 * Displays a popup showing the supplied string to the user.
	 * @param textToDisplay
	 */
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}
	
	/**
	 * Uses a Popup to display a question to the user and stores response
	 * @param fromQuestion
	 * @return
	 */
	public String getResponse(String fromQuestion)
	{
		String answer = "";
		
		answer += JOptionPane.showInputDialog(null, fromQuestion);
		
		return answer;
	}
}