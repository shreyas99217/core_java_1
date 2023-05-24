package Pisyst;

public class Sim {
	private String ServiceProvider;
	private long mbno;
	private long Simcardno;
	Sim(String s1, long l1, long l2)
	{
		ServiceProvider =s1; 
		mbno=l1;
		Simcardno=l2;
	}
	public String getServiceProvider()
	{
		return ServiceProvider;
	}
	public void setServiceProvider(String s1)
	{
		ServiceProvider=s1;
	}
	public long getmbno()
	{
		return mbno;
	}
	public void Setmbno(long l1)
	{
		mbno=l1;
	}
	public long getsimcardno()
	{
		return Simcardno;
	}
	public void setSimcardno(long l2)
	{
		Simcardno=l2;
	}
	
}
