
public class RotateOrder {
	public static void main(String[] args) {
      String sts="1235";
      String actVal ="2341";
      for(int i =sts.length()-1;i>0;i--)
      {
    	  actVal=actVal.charAt(i)+actVal;
    	  actVal=actVal.substring(0,actVal.length()-1);
    	  if(actVal.equals(sts))
    	  {
    		  System.out.println("foun");
    		  break;
    		  
    	  }
    	  else System.out.println("not");
    	  
      }
	}
}
