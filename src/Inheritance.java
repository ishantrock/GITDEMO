
public class Inheritance 
{
public static void Add(int a, int b )

{
	System.out.println("First Method");
}
	
public void Add(int a, String b )

{
	System.out.println("Second Method");
}

public static void main(String[] args) 
{
	Inheritance I = new Inheritance ();
	I.Add(1, 2);
	I.Add(1, "Ishant");
}


}