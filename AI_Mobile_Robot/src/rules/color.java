package rules;

public class color {
	String warnaCari;
	String sensorKiri, sensorKanan, sensorDepan;
	String[] step = new String[100];
	String[] warnax = new String[100];
	boolean check;

	public void warna(String x) {
		
		warnaCari = x;

			if (warnaCari.equals("hijau")) {
				warnax[0] = "merah";
				warnax[1] = "kuning";
				warnax[2] = "hijau";

			} else if (warnaCari.equals("kuning")) {
				warnax[0] = "hijau";
				warnax[1] = "merah";
				warnax[2] = "kuning";
			} else if (warnaCari.equals("merah")) {
				warnax[0] = "kuning";
				warnax[1] = "hijau";
				warnax[2] = "merah";
			}else System.out.println("error");
			

		}
		
}