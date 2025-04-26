package day7_26042025;

public class Container<T,U>{ // ma classe générique
	
	public T t;
	
	public void addElement(T t)
	{
		this.t = t;
	}
	
	public void info()
	{
		System.out.println(this.t);
	}

}
