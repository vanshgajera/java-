abstract class person
{
	protected  String name;
	protected  int age;
	
	public person(String n, int a)
	{
		name = n;
		age = a;
	}
	
	abstract void showdetails();
}

class student extends person
{
	private int rollNo;
	
	public student(String name, int age, int rollNo)
	{
		super(name,age);
		this.rollNo = rollNo;
	}
	
	public void showdetails()
	{
		System.out.println("Name : " + name);
		System.out.println("age : " + age);
		System.out.println("rollNo : " + rollNo);
	}
	
}

public class task5
{
	public static void main(String[] args)
	{
		person p = new student("Aruna", 20, 101);
		p.showdetails();
	}
}