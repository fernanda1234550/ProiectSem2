package utils;
import java.util.Scanner;

public class Main {
     public static void main(String[]args){
    	 
    	 System.out.println("1.Romana");
    	 System.out.println("2.Matematica");
    	 System.out.println("3.LbEngleza");
    	 System.out.println("4.Biologie");
    	 System.out.println("5.Geografie");
    	 
    	 System.out.println("Algeti un subiect :");
    	 
    	 Scanner sub=new Scanner(System.in);
    	 Integer cc= sub.nextInt();
    	 
    	 System.out.println("Introdu nota");
    	 Integer nota=sub.nextInt();
    	 
    	 switch(cc){
    	 case 1:
    		 System.out.println("Nota la Roamana este :"+ nota );
    		 break;
    	 case 2:
    		 System.out.println("Nota la Matematica este : " + nota);
    		break;
    	 case 3: 
    		 System.out.println("Nota la LbEngleza este : " + nota); 
    		 break;
    	 case 4:
    		 System.out.println("Nota la  Biologie este : " + nota );
    		 break;
    	 case 5:
    		 System.out.println(" Nota la Geografie este : " + nota);
    		 break;
    	 }
    	
    	
     }
     
     
}
