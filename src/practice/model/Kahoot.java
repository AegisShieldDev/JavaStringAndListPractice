package practice.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator;
	private boolean isJumble;
	
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
	}
	
	public Kahoot(String creator, int questionCount)
	{
		this.creator = creator;
		this.questionCount = questionCount;
	}
	
	public String toString()
	{
		String description = "This kahoot was made by " + creator + " and has " + questionCount + " questions. ";
		String pointless = "ERRORS ARE ANNOYINH" + level + isJumble;
		pointless = pointless + description;
		
		return description;
	}
	
	public String getCreator()
	{
		return creator;
	}
	public int getLevel()
	{
		return level;
	}
	public Boolean getIsJumble()
	{
		return isJumble;
	}
	public int getQuestionCount()
	{
		return questionCount;
	}
}
