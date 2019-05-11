package day06;

public class MainOOP {

	public static void main(String[] args) {
	
		Mahasiswa mhs = new Mahasiswa();
		mhs.id = 1;
		mhs.nama = "Sahal";
		mhs.alamat = "Jakarta";
		mhs.jk = "Laki-laki";
		mhs.noTelp = "081382492921";
		mhs.nim = "12130074";
		mhs.jurusan = "Manajemen Informatika";
		mhs.fakultas = "Sistem Informasi";
		mhs.angkatan = "2013";
		mhs.ipk = 3.36;
		
		Dosen dsn = new Dosen();
		dsn.id = 100;
		dsn.nama = "Purwanto";
		dsn.alamat = "Jakarta";
		dsn.jk = "Laki-laki";
		dsn.noTelp = "12345";
		dsn.nik = "14045";
		dsn.spesialis = "Komputer";
		dsn.gaji = 5000000;
		dsn.jabatan = "Dosen";
		dsn.fakultas = "Sosial";
		
		Staff stf = new Staff();
		stf.id = 1000;
		stf.nama = "Ahmad";
		stf.alamat = "Jakarta";
		stf.jk = "Laki-laki";
		stf.noTelp = "98765";
		stf.nik = "123456";
		stf.jabatan = "Payroll";
		stf.gaji = 4000000;
		stf.departemen = "Finance";
		stf.atasan = "Hea of Finance";
		
	}

}
