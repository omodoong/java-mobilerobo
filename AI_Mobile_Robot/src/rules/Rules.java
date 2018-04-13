package rules;

public class Rules {
	float jarak, nilaiKelayakanTurun, nilaiKelayakanNaik, dekat, cukupDekat, jauh, sangatJauh;
	String hasil;

	public void Works(float x) {
		jarak = x;
		if (jarak >= 0 && jarak <= 1) { // dekat
			hasil = "dekat";
			dekat = 1;
		} else if (jarak > 1 && jarak < 2) {
			nilaiKelayakanTurun = (2 - jarak) / (2 - 1);
			nilaiKelayakanNaik = (jarak - 1) / (2 - 1);
			dekat = nilaiKelayakanTurun;
			cukupDekat = nilaiKelayakanNaik;
			if (nilaiKelayakanNaik > nilaiKelayakanTurun) {
				hasil = "cukup dekat";
			} else if (nilaiKelayakanNaik < nilaiKelayakanTurun) {
				hasil = "dekat";
			} else if (nilaiKelayakanNaik == nilaiKelayakanTurun) {
				hasil = "cukup dekat";
			}

		} else if (jarak >= 2 && jarak <= 3) { // cukup
			hasil = "cukup dekat";
			cukupDekat = 1;
		} else if (jarak > 3 && jarak < 4) {
			nilaiKelayakanTurun = (4 - jarak) / (4 - 3);
			nilaiKelayakanNaik = (jarak - 3) / (4 - 3);
			cukupDekat = nilaiKelayakanNaik;
			jauh = nilaiKelayakanTurun;
			if (nilaiKelayakanNaik > nilaiKelayakanTurun) {
				hasil = "jauh";
			} else if (nilaiKelayakanNaik < nilaiKelayakanTurun) {
				hasil = "cukup dekat";
			} else if (nilaiKelayakanNaik == nilaiKelayakanTurun) {
				hasil = "jauh";
			}

		} else if (jarak >= 4 && jarak <= 5) { // jauh
			hasil = "jauh";
			jauh = 1;
		} else if (jarak > 5 && jarak < 6) {
			nilaiKelayakanTurun = (6 - jarak) / (6 - 5);
			nilaiKelayakanNaik = (jarak - 5) / (6 - 5);
			jauh = nilaiKelayakanNaik;
			sangatJauh = nilaiKelayakanTurun;
			if (nilaiKelayakanNaik > nilaiKelayakanTurun) {
				hasil = "sangat jauh";
			} else if (nilaiKelayakanNaik < nilaiKelayakanTurun) {
				hasil = "jauh";
			} else if (nilaiKelayakanNaik == nilaiKelayakanTurun) {
				hasil = "sangat jauh";
			}
		} else if (jarak >= 6) {			//sangat jauh
			hasil = "sangat jauh";
			sangatJauh=1;
		}
	}

	public String Hasilnya() {
		return hasil;

	}
}
