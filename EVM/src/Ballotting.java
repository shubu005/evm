
public class Ballotting {
		public candidate c1;
	    public candidate c2;
	    public candidate c3;
	    
	    public candidate won;
	    
	    
	    
	    public Ballotting(String c1, String c2, String c3)
	    {
	        this.c1 = new candidate(c1);
	        this.c2 = new candidate(c2);
	        this.c3 = new candidate(c3);
	        this.won = new candidate("");  
	}


	    
	    public void castVote(int v)
	    {
	        if (v == 1)
	            c1.CountVote();
	        else if (v == 2)
	            c2.CountVote();
	        else if (v == 3)
	            c3.CountVote();
	       
	    }
	    
	   


	    private void compareWinner(candidate c)
	    {
	        int winningVote = 0;
	        if(c1.getNumberOfVotes() > winningVote)
	            winningVote = c1.getNumberOfVotes();
	 
	        if(c2.getNumberOfVotes() >= winningVote)
	            winningVote = c2.getNumberOfVotes();

	        if(c3.getNumberOfVotes() >= winningVote)
	            winningVote = c3.getNumberOfVotes();

	 
	        if(won.getNumberOfVotes() != winningVote)
	            won = c;

	    }

	    

	    private void findWinner()
	    {
	        compareWinner(c1);
	        compareWinner(c2);
	        compareWinner(c3);
	    }

	    
	    public String reportResults()
	    {
	        findWinner();
	        return drawGraph();
	    }


	    private String drawGraph()

	    { 
	        return leader(won.getName(), won.getNumberOfVotes());
	    }

	    private String leader(String winnerName, int votes)
	    {   drawGraph();
	        return ("The winner of the election is" + won.getName() + "with"
	            + won.getNumberOfVotes() + "\n" + "Results graph");

	    }


}
