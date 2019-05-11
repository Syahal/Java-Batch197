package Latihan;

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(timeConversion("07:05:45PM"));
		System.out.println(timeConversion("12:40:22AM"));
		System.out.println(timeConversion("12:05:39AM"));
		System.out.println(timeConversion("12:00:00AM"));
	}
	
	static String timeConversion(String s) {
        
		String hasil = "oke";
		
		String waktu = s.substring(8);
		
		int jam = Integer.parseInt(s.substring(0,2));
		if(waktu.equals("PM")) {
			if(jam < 12)
			jam += 12;
			hasil = jam + s.substring(2,8);
		} else {
			if(jam == 12) {
				jam = 0;
				hasil = "00" + s.substring(2,8);
			} else {
				hasil = s.substring(0,8);
			}
		}
		
		return hasil;

    }

}
