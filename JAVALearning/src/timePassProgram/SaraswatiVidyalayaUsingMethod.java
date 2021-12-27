package timePassProgram;

public class SaraswatiVidyalayaUsingMethod
{
	int maths;
	int chemistry;
	int physics;
	public SaraswatiVidyalayaUsingMethod(int maths,int chemistry,int physics) 
	{
		this.maths=maths;
		this.chemistry=chemistry;
		this.physics=physics;
		
	}
	
	public void avdut()
	{
		System.out.println("avdut got marks as follows: ");
		System.out.println("maths:" + maths);
		System.out.println("chemistry:" + chemistry);
		System.out.println("physics:" + physics);
	}
	
	public void adesh()
	{
		System.out.println("adesh got marks as follows: ");
		System.out.println("maths:" + maths);
		System.out.println("chemistry:" + chemistry);
		System.out.println("physics:" + physics);
	}

	public void seema()
	{
		System.out.println("seema got marks as follows: ");
		System.out.println("maths:" + maths);
		System.out.println("chemistry:" + chemistry);
		System.out.println("physics:" + physics);
	}
	
	public static void main(String[] args) 
	
	{
		SaraswatiVidyalayaUsingMethod a=new SaraswatiVidyalayaUsingMethod(80,80,85);
		a.adesh();
		
		
	}

}
