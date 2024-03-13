import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalFunction {



		public static void main(String[] args) {
			
			//DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("en","US"));
			DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("de","DE"));
			
			String d2=df.format(new Date());
			
			//String d1=df.format(new Date());
	        //System.out.println(d1);
			
			System.out.println(d2);
		}

	}




