
public class election {
	String constituency;
	int tvotes;
	
	public election(String consti, int tv){
		this.constituency=consti;
		this.tvotes=tv;
	}
	
	public void countVotes(int v){
		tvotes=v;
	}
}
