package JavaChallenges;

public class Stringlastword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = " fly me to  the moon ";
		
		String[] a= s.split("\\s+");
		//String[] d = a.replaceAll("\\s+","");
		  
		
		System.out.println("To see the split happens:");
		for(int i =0;i<a.length;i++)
		{
				System.out.println(""+a[i]);
				
		}
		System.out.println("");
        String b = a[a.length-1];
        System.out.println("Last Word: "+b);
        System.out.println(""+b.length());
  
 
	}


}
