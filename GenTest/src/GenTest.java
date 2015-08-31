
	class GenTesting<T> {
	T o;
	GenTesting(T ob){
		o=ob;
	}
	T Get(){
		return o;
	}
	void show(){
		System.out.println("Type"+o.getClass().getName());
	}
}
public class GenTest{
	public static void main(String args[]){
		GenTesting<Integer> ob = new GenTesting<Integer>(100);
		int i=ob.Get();
		ob.show();
		System.out.println("i="+i);
		
		GenTesting<String> ob1= new GenTesting<String>("Hello");
		String s=ob1.Get();
		ob1.show();
		System.out.println("s="+s);
	}
}