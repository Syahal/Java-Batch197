package day01;

public class SampleTest01 {
	int baris = 0;
	int kolom = 0;
	
	public String[][] getDataArray(int input){
		this.baris = input;
		this.kolom = input;
		
		String[][] data = new String[baris][kolom];
		
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				if (i == j) {
					data[i][j] = "*";	
				}
							
			}
		}
		
		return data;
	}
	
	public void showDataArray(int input)	{
		String[][] data = getDataArray(input);
				
		for (int i = 0; i < baris; i++) {
			for (int j = 0; j < kolom; j++) {
				System.out.print(data[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleTest01 ls = new SampleTest01();
		ls.showDataArray(9);
	}

}
