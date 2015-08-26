package gittest;

public class ShowMsg {
	void Show(){
		System.out.println("This is inside Show");
		int []a=new int[5];
		for (int i=0;i<a.length;i++)
		{
			a[i]=i*i;
			System.out.println(" "+a[i]);
		}
	}
	void Disp()
	{
		System.out.println("This is displays");
	}

}
