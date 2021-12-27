package timePassProgram;

public class JspmJscoeUsingThis
{
	int math1;
	int math2;
	int math3;
	
	public void StudentsMarks(int math1,int math2, int math3)
	{
		this.math1=math1;
		this.math2=math2;
		this.math3=math3;
		System.out.println("marks of student is:");
		
		System.out.println("math1:" +math1);
		System.out.println("math2:" +math2);
		System.out.println("math3:" +math3);
	}
		
		public void akash()
		{
			StudentsMarks(80,80,80);
		}
		
		public void shivan()
		{
			StudentsMarks(80,80,80);
		}
		
		public void pratibha()
		{
			StudentsMarks(80,80,80);
		}
	

	public static void main(String[] args)
	{
		JspmJscoeUsingThis a=new JspmJscoeUsingThis();
		JspmJscoeUsingThis s=new JspmJscoeUsingThis();
		JspmJscoeUsingThis p=new JspmJscoeUsingThis();
		
	a.akash();
	s.shivan();
	p.pratibha();
		
		
	}

}
