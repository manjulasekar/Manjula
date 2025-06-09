package JavaChallenges;

public class Stringlastword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "luffy is still joyboy";
     String[] a = s.split("\\s+");
     for(int i =0;i<a.length;i++)
     {
    	 System.out.println(""+a[i]);
     }
      
     String b = a[a.length-1];
     System.out.println("Last Word is: "+b);
     System.out.println("length of the word:"+b.length());
     
    		 
	}

}
