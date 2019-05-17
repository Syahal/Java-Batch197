package exercise;

public class JavaOp {

	public static void main(String[] args) {
		
		//AritmatikaOp
		
		int variable1 = 7;
		int variable2 = 3;
		int hasil;
		
		//Modulus (sisa pembagian)
		hasil = variable1 % variable2;
		System.out.printf("%d %% %d = %d \n", variable1,variable2,hasil);
		
		//Penjumlahan (+)
		hasil = variable1 + variable2;
		System.out.println(variable1 + " + " + variable2 + " = " + hasil);
		
		//Pengurangan (-)
		hasil = variable1 - variable2;
		System.out.printf("%d - %d = %d \n", variable1,variable2,hasil);
		
		//Perkalian (-)
		hasil = variable1 * variable2;
		System.out.printf("%d * %d = %d \n", variable1,variable2,hasil);

		//Pembagian (-)
		hasil = variable1 / variable2;
		System.out.printf("%d / %d = %d \n", variable1,variable2,hasil);
		
		float a = 13;
		float b = 9;
		float hasilFloat = a/b;
		System.out.printf(a + " / " + b + " = " + hasilFloat);
		
		System.out.println("\n\n\n");
		
		//Operator Unary ( Increment & Decrement )
		//Operator yang dilakukan pada satu variable saja
		
		//unary + dan -
		int angka = 1;
		System.out.printf("unary '+' %d menjadi %d\n", angka, +angka);
		System.out.printf("unary '-' %d menjadi %d\n", angka, -angka);
		
		//unary increment dan decrement
		int angka2 = 10;
		angka2++;
		System.out.println("nilai dengan '++' menjadi = " + angka2);
		
		int angka3 = 10;
		angka3--;
		System.out.println("nilai dengan '--' menjadi = " + angka3);
		
		int x = 3;
		System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++x);
		
		int y = 7;
		System.out.printf("nilai dengan '++' postfix menjadi = %d \n", y++);
		System.out.printf("nilai hasil dari postfix menjadi = %d \n", y);
		
		System.out.println("\n\n\n");
		
		//Operator Assignment (=)
		int p = 10;
		p += 10; //p = p + 10
		System.out.println("Nilai p = " + p);
		p -= 5; //p = p - 10
		System.out.println("Nilai p = " + p);
		p *= 5; //p = p * 10
		System.out.println("Nilai p = " + p);
		p /= 5; //p = p / 10
		System.out.println("Nilai p = " + p);
		p %= 5; //p = p % 10
		System.out.println("Nilai p = " + p);
		
		System.out.println("\n\n\n");
		
		//Operator Komparasi. Membandingkan nilai satu dengan nilai pembanding. Menghasilkan nilai dalam bentuk boolean
		//equal == / not equal != / less < / grater > / less then equal <= / greater then equal >=
		
		//Operator Logika
		//Operasi yang dilakukan terhadap tipe data boolean
		//AND, OR, XOR, negasi(NOT)/flipping->membalikkan nilai
		
		boolean j,k,l;
		
		//OR atau (||)
		
		System.out.println("=== OR (||) ====");
		j = false;
		k = false;
		l = (j||k);
		System.out.println(j + " || " + k + " = " + l);
		j = false;
		k = true;
		l = (j||k);
		System.out.println(j + " || " + k + " = " + l);
		j = true;
		k = false;
		l = (j||k);
		System.out.println(j + " || " + k + " = " + l);
		j = true;
		k = true;
		l = (j||k);
		System.out.println(j + " || " + k + " = " + l);
		
		System.out.println("=== AND (&&) ====");
		j = false;
		k = false;
		l = (j&&k);
		System.out.println(j + " && " + k + " = " + l);
		j = false;
		k = true;
		l = (j&&k);
		System.out.println(j + " && " + k + " = " + l);
		j = true;
		k = false;
		l = (j&&k);
		System.out.println(j + " && " + k + " = " + l);
		j = true;
		k = true;
		l = (j&&k);
		System.out.println(j + " && " + k + " = " + l);
		
		System.out.println("=== XOR/exclusive (^) ====");
		j = false;
		k = false;
		l = (j^k);
		System.out.println(j + " ^ " + k + " = " + l);
		j = false;
		k = true;
		l = (j^k);
		System.out.println(j + " ^ " + k + " = " + l);
		j = true;
		k = false;
		l = (j^k);
		System.out.println(j + " ^ " + k + " = " + l);
		j = true;
		k = true;
		l = (j^k);
		System.out.println(j + " ^ " + k + " = " + l);
		
		System.out.println("=== NOT/negasi (^) ====");
		j = true;
		k = !k;
		System.out.println(j +  " --> (!) = " + k);
		j = false;
		k = !k;
		System.out.println(j +  " --> (!) = " + k);
		
		System.out.println("\n\n\n");
		
		//Operator Bitwise
		//Sebuah operator untuk melakukan operasi bit
		
		byte q = 3;
		byte r;
		String q_bits, r_bits, p_bits;
		
		//Operator SHIFT LEFT
		System.out.println("=== SHIFT LEFT (<<)");
		q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
		System.out.printf("%s = %d \n", q_bits, q);
		r = (byte)(q << 3);
		r_bits = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
		System.out.printf("%s = %d \n", r_bits, r);
		
		//Operator SHIFT RIGHT
		System.out.println("=== SHIFT RIGHT (>>)");
		q = 24;
		q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
		System.out.printf("%s = %d \n", q_bits, q);
		r = (byte)(q >> 2);
		r_bits = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
		System.out.printf("%s = %d \n", r_bits, r);
		
		//Operator Bitwise OR
		System.out.println("=== BITWISE OR (|)");
		q = 24;
		q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
		System.out.printf("%s = %d \n", q_bits, q);
		r = 12;
		r_bits = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
		System.out.printf("%s = %d \n", r_bits, r);
		System.out.println("---------OR");
		p = (byte) (q|r);
		p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
		System.out.printf("%s = %d \n", p_bits, p);
		
		//Operator Bitwise AND
		System.out.println("=== BITWISE AND (&)");
		q = 24;
		q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
		System.out.printf("%s = %d \n", q_bits, q);
		r = 12;
		r_bits = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
		System.out.printf("%s = %d \n", r_bits, r);
		System.out.println("---------OR");
		p = (byte) (q&r);
		p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
		System.out.printf("%s = %d \n", p_bits, p);
		
		//Operator Bitwise XOR
		System.out.println("=== BITWISE XOR (^)");
		q = 24;
		q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
		System.out.printf("%s = %d \n", q_bits, q);
		r = 12;
		r_bits = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
		System.out.printf("%s = %d \n", r_bits, r);
		System.out.println("---------OR");
		p = (byte) (q^r);
		p_bits = String.format("%8s", Integer.toBinaryString(p)).replace(' ', '0');
		System.out.printf("%s = %d \n", p_bits, p);
		
		//Operator Bitwise Negasi/NOT
		System.out.println("=== BITWISE NOT (~)");
		q = 24;
		r = (byte) (~q);
		q_bits = String.format("%8s", Integer.toBinaryString(q)).replace(' ', '0');
		System.out.printf("%s = %d \n", q_bits, q);
		r_bits = String.format("%8s", Integer.toBinaryString(r).substring(24));
		System.out.printf("%s = %d \n", r_bits, r);
		
	}

}
