package day05;


	public class Orang {
	//property or state
	public int id;
	public String nama;
	public String alamat;
	public String jk;
	public String noTelp;	
	
	//construct tanpa parameter
	public Orang() {
		
	}
	
	//construct dengan parameter
	public Orang(int id, String nama, String alamat, String jk, String noTelp) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.jk = jk;
		this.noTelp = noTelp;
	}
	
	public void cetakData() {
		System.out.println("ID \t\t : " + id);
		System.out.println("Nama \t\t : " + nama);
		System.out.println("Alamat \t\t : " + alamat);
		System.out.println("JK \t\t : " + jk);
		System.out.println("No Telp \t\t : " + noTelp);
	}
} 
