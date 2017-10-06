package practice.model;

public class Kahoot
{
	private int questionCount;
	private int level;
	private String creator, topic;
	private boolean isJumble;
	
	public Kahoot()
	{
		this.questionCount = 0;
		this.level = 1;
		this.creator = "Nobody";
		this.isJumble = false;
		this.topic = "Some topic";
	}
	
	public Kahoot(String creator, int questionCount, String topic)
	{
		this();
		this.creator = creator;
		this.questionCount = questionCount;
		this.topic = topic;
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
	public String getTopic()
	{
		return topic;
	}
}
