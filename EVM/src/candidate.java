public class candidate {

	String Cname;
	int totalVotes;
	
	public candidate(String name) 
	{
		totalVotes=0;
		this.Cname=name;
		
	}
	
	public int getNumberOfVotes()
    {
        return totalVotes;
    }
	
	public String getName()
	{
		return Cname;
	}
	

    public void CountVote()
    {
        totalVotes++;
    }
    

    

	
	
}