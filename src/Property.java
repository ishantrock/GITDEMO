import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;

public class Property {

	public static void main(String[] args)  
	{
	int size;
	int curr=0;
		Scanner sc = new Scanner (System.in);
	//System.out.println("Enetr size");
	size=sc.nextInt();
	
		int [] data = new int [size];
		for(int i =0; i<size; i++)
		{
			
			data[i]=sc.nextInt();
		}
		
		int near =data[0];
		
		
		Arrays.sort(data);      //  add this
        Arrays.toString(data);        
        // find the element nearest to zero
        for ( int i=0; i < data.length; i++ ){
           // System.out.println("dist from " + data[i] + " = " + Math.abs(0 -data[i]));
            curr = data[i] * data[i]; 
            if ( curr <= (near * near) )  { 
                near = data[i];
            } 
        }
        System.out.println( near );
    }}
