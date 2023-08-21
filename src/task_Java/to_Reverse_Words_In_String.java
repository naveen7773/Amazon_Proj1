package task_Java;

public class to_Reverse_Words_In_String {

	public static void main(String[] args) {

		String str = "If there is a will there is a way";
        String [] a = str.split(" "); 
        
     //   for(int i = 0; i<a.length; i++) {
    //    	System.out.print(a[i] + " ");
     //   }
        
        // System.out.println("");
        for(int i=a.length-1;i>=0; i--) {
        	System.out.print(a[i] + " ");
        }
        
	}

}
