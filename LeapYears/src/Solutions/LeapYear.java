package Solutions;

public class LeapYear {

	public boolean checkLeapYear(int year) throws Exception {
		if(year<=0) {
			throw new Exception();
		}
		if( (year%4==0 && year%100!=0)|| year%400==0) {
			return true;
		}
		return false;
	}

}
