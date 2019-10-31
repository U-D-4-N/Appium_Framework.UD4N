package Framework.Appium_UD4N.core;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper extends Core {
	
	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yy_HH_mm_ss")
		Date currentDate = new Date();
		return customFormat.format(currentDate);
		
	}

}
