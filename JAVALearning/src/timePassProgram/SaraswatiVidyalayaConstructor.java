package timePassProgram;

public class SaraswatiVidyalayaConstructor 
{
	int maths;
	int chemistry;
	int physics;
	public SaraswatiVidyalayaConstructor(int maths,int chemistry,int physics) 
	{
		this.maths=maths;
		this.chemistry=chemistry;
		this.physics=physics;
		
	}
	public static void main(String[] args) 
	{
		SaraswatiVidyalayaConstructor avdut=new SaraswatiVidyalayaConstructor(80,82,85);
		System.out.println("avdut got " + avdut.chemistry + " marks in chemistry");
		
		System.out.println("avdut total marks are " +( avdut.maths + avdut.chemistry + avdut.physics));
		
		SaraswatiVidyalayaConstructor adesh=new SaraswatiVidyalayaConstructor(80,82,85);
		System.out.println("adesh got " + adesh.maths + " marks in maths" );
		
		
	}
}
