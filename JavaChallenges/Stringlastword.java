package JavaChallenges;

public class Stringlastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello World";
            
      //  s=s.trim();//removes leading/trailing space
       // System.out.println(s);
        
        
      //->split the words
     // \\s+ ->means split the string into words whenever thers's one or more spaces.   
        String[] a=s.split("\\s+"); 
        
        
      for(int i=0;i<a.length;i++)
       {
       	System.out.print("To see the split happens:");
       	System.out.println(""+a[i]);
       }
        
         
       //  To find the last word     
        String b = a[a.length -1];
        System.out.println(""+b);
        System.out.println("split by one:"+b.length());
        
	}

}
