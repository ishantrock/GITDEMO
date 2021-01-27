import java.util.*;


public class Occurance {

	public static void main(String[] args) 
	{
		String S = "Ishant";
		List<char[]> list = Arrays.asList(S.toCharArray());
		//ArrayList<Character> list = new ArrayList <Character>(Arrays.asList('I', 'S', 'S', 'A', 'N', 'T'));
		 
     HashSet<char[]> distinct = new HashSet<>(list);
     
     Iterator<char[]> it = distinct.iterator();
     /*while(it.hasNext())
     {
     System.out.println();
     }*/
        for (char[] s: distinct) 
        {
            System.out.println(s + ": " + Collections.frequency(list, s));
	
        }

}
}