import java.text.NumberFormat;
import java.util.Locale;

public class LocalFunctionp1 {

	
		public static void main(String[] args) {
			
			NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("en","US"));
			String formatted=nft.format(100000);
			System.out.println(formatted);
		}

	}

