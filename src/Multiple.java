import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) 
	{
		  Scanner s = new Scanner(System.in);

	        int n = s.nextInt();

	        String seatType="";

	        int seatNum = 0;

	        int seatFacing = 0;

	    for(int i=0;i<n;i++)

	    {

	        seatNum = s.nextInt();

	        if(seatNum%6==0)

	        {

	            seatType="WS";

	            if((seatNum/6)%2==1)

	                seatFacing= seatNum+1;

	            else if((seatNum/6)%2==0)

	                seatFacing = seatNum-11;

	        }

	        else if(seatNum%6==1)

	        {

	            seatType="WS";

	            if((seatNum/6)%2==1)

	                seatFacing= seatNum-1;

	            else if((seatNum/6)%2==0)

	                seatFacing = seatNum+11;

	        }

	        else if(seatNum%6==2)

	        {

	            seatType="MS";

	            if((seatNum/6)%2==1)

	                seatFacing= seatNum-3;

	            else if((seatNum/6)%2==0)

	                seatFacing = seatNum+9;

	        }

	        else if(seatNum%6==5)

	        {

	            seatType="MS";

	            if((seatNum/6)%2==1)

	                seatFacing= seatNum-9;

	            else if((seatNum/6)%2==0)

	                seatFacing = seatNum+3;

	        }

	        else if(seatNum%6==3)

	        {

	            seatType="AS";

	            if((seatNum/6)%2==1)

	                seatFacing= seatNum-5;

	            else if((seatNum/6)%2==0)

	                seatFacing = seatNum+7;

	        }

	        else if(seatNum%6==4)

	        {

	            seatType="AS";

	            if((seatNum/6)%2==1)

	                seatFacing= seatNum-7;

	            else if((seatNum/6)%2==0)

	                seatFacing = seatNum+5;

	        }

	 System.out.println(seatFacing+" "+seatType);

	    }

	    }

	
		
		
	
	
	
	
public void run()
{
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
String s = sc.next();

 System.out.println(num*2);
 System.out.println(s);


	}

}
