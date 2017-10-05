package practice.controller;

import java.util.List;
import java.util.ArrayList;
import practice.model.Kahoot;
import practice.view.PracticeDisplay;

public class PracticeController
{
	private PracticeDisplay popup;
	private List<Kahoot> myKahoots;	
	
	public PracticeController()
	{
		myKahoots = new ArrayList<Kahoot>();
		popup = new PracticeDisplay();
	}
	
	/**
	 * Runs fillTheList
	 */
	public void start()
	{
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for(int index = 0; index < myKahoots.size(); index += 1)
		{
			popup.displayText(myKahoots.get(index).toString());
		}
		System.exit(0);
	}
	
	/**
	 * Creates Kahoots
	 */
	private void fillTheList()
	{		
		Kahoot fiftyStates 		= new Kahoot("Kashish",	50);
		Kahoot mySecondKahoot 	= new Kahoot("Ethan"	,	2);
		Kahoot bigQuiz 			= new Kahoot("Derek"	,	Integer.MAX_VALUE);
		Kahoot animalColor 		= new Kahoot("Branton",	010);
		Kahoot presidents 		= new Kahoot("Obama"	,	44);
		
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
