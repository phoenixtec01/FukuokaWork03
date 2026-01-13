
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//日付チェッククラス
public class DateCheck {

	public void dateCheck(String date) throws AllException {
		
		if (date == null || date.length() != 10 ) {
			throw new AllException(AllException.ErrorCode.DATE_ERROR);
		}
		
		String customDate = date.replace("-", "").replace("/", "");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setLenient(false);
		
		try {
			
			int year = Integer.parseInt(customDate.substring(0, 4));
			int month = Integer.parseInt(customDate.substring(4, 6));
			int day = Integer.parseInt(customDate.substring(6, 8));
			
			calendar.set(year,  month - 1, day);
			
			calendar.getTime();
			
		} catch (IllegalArgumentException e) {
			throw new AllException(AllException.ErrorCode.DATE_ERROR);
		}
	}
	
	public String dateConversion(String date) {
		
		Date day = new Date();
		String newDate = null;
		
		if (date == "yyyyMMddHHmmssSSS") {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
			newDate = sdf.format(day);
		}
		return newDate;
	}
}
