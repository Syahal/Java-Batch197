package exercise;

public class HRStrongPassword {

	public static void main(String[] args) {

		int case1= minimumNumber(11, "#HackerRank");
		System.out.println(case1);
		int case2 = minimumNumber(3, "Ab1");
		System.out.println(case2);
	}
	
	static int minimumNumber(int n, String password) {
     
		String numbers = "0123456789";
		String lower_case = "abcdefghijklmnopqrstuvwxyz";
		String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String special_characters = "!@#$%^&*()-+";
		char[] input = password.toCharArray();
		
		int count=4;
		int ddoss = 6-n;
		
		boolean num=true;
		boolean l=true;
		boolean u=true;
		boolean s=true;
		
		for (int i = 0; i < n; i++) {
			if(numbers.indexOf(input[i])>=0 && num) {
				count--;
				num=false;
			}
			if(lower_case.indexOf(input[i])>=0 && l) {
				count--;
				u=false;
			}
			if(special_characters.indexOf(input[i])>=0 && s) {
				count--;
				s=false;
			}
		}
		
		if(ddoss>count)
			return ddoss;
		else
			return count;
    }

}
