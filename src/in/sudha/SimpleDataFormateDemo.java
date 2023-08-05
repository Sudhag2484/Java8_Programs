package in.sudha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormateDemo {

	public static void main(String[] args) throws Exception {
   
		Date date = new Date();
		System.out.println(date);
		
		//Convert date to string 
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(date));
		
		//convert String to date 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-dd-MM");
		   Date date1 = sdf1.parse("2023-06-08");
		   System.out.println(date1);
	}

}
