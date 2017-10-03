package practice.controller;

import java.util.List;
import java.util.ArrayList;
import practice.model.Kahoot;
import practice.view.*;

public class PracticeController
{
	private PracticeDisplay popup;
	private List<Kahoot> myKahoots;	
	
	public void ListsController()
	{
		myKahoots = new ArrayList();
	}
	
	public void start()
	{
		Kahoot myFirstKahoot = new Kahoot();
		myKahoots.add(myFirstKahoot);
	}
	
	private void fillTheList()
	{
		String responce = "";
		responce = popup.getResponse("How many questions do you want?");
		
		Kahoot fiftyStates = new Kahoot("Kashish",50);
		Kahoot mySecondKahoot = new Kahoot("Ethan", 2);
		Kahoot bigQuiz = new Kahoot("Derek", Integer.MAX_VALUE);
		Kahoot animalColor = new Kahoot("Branton",010);
		Kahoot presidents = new Kahoot("Obama", 44);
		
		myKahoots.add(fiftyStates);
		myKahoots.add(mySecondKahoot);
		myKahoots.add(bigQuiz);
		myKahoots.add(animalColor);
		myKahoots.add(presidents);
	}
}
