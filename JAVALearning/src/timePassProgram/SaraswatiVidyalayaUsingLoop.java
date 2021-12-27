package timePassProgram;
public class SaraswatiVidyalayaUsingLoop   {
	int maths;
	int chemistry;
	int physics;
	int totalmarks;
	public SaraswatiVidyalayaUsingLoop(int maths,int chemistry,int physics) 
	{
		this.maths=maths;
		this.chemistry=chemistry;
		this.physics=physics;
	}
	public void avdut()      {
		System.out.println("avdut got marks as follows: ");
		System.out.println("maths:" + maths);
		System.out.println("chemistry:" + chemistry);
		System.out.println("physics:" + physics);
		System.out.println("total marks of avdut :" +(maths +chemistry +physics));
	}
	public void adesh()      {
		System.out.println("adesh got marks as follows: ");
		System.out.println("maths:" + maths);
		System.out.println("chemistry:" + chemistry);
		System.out.println("physics:" + physics);
		System.out.println("total marks of adesh :" +(maths +chemistry +physics));
	}
	public void TotalMarks()      { 
		totalmarks=this.maths+this.chemistry+this.physics;
		if(totalmarks> 40)
			System.out.println("student is pass");
		else
			System.out.println("student is fail");
	}
		public static void main(String[] args) {
		SaraswatiVidyalayaUsingLoop	avdut=new SaraswatiVidyalayaUsingLoop(80,80,80);
			avdut.avdut();
			avdut.TotalMarks();
	} 
	}
