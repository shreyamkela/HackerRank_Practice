import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;


public class Test{
	
    public static String getDay(String day, String month, String year) {
    	try { 
    		// try catch is used otherwise parseException will give error as parse(s) i being used
	        String s = day + month + year;
	        SimpleDateFormat format1 = new SimpleDateFormat("ddMMyyyy");
	        Date dt1 = format1.parse(s);
	        format1.applyPattern("EEEE");
            s = format1.format(dt1);
            String finalDay = s.toUpperCase();
            return finalDay;
    	}
    	catch(ParseException e) {
			e.printStackTrace();  
			return "You get the ParseException";
    	}
        

    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
        System.out.println(getDay(day, month, year));
    }
}