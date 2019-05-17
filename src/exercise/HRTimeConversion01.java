package exercise;

public class HRTimeConversion01 {

	public static void main(String[] args) {
		
		System.out.println(timeConversion("14.30.33"));

	}
	
	static String timeConversion(String s) {
		String hasil = "OKE";
		String waktu = s.substring(8);
		
		int jam=Integer.parseInt(s.substring(0,2));
		if(waktu.equals("PM")){
			if(jam<12)
				jam+=12;
				hasil=jam+s.substring(2,8);
		} else {
			if(jam==12) {
				jam=0;
				hasil="00"+s.substring(2,8);
			} else {
				hasil=s.substring(0,8);
			}
		}
		return hasil;
	}

}
