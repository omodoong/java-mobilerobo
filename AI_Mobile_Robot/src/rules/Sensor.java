package rules;

public class Sensor {
	
	String jarakKiri,jarakKanan,jarakDepan;
	
	public void Sensor1(float x,float y,float z){
	Rules rules = new Rules();
	float sensor1,sensor2,sensor3;
	sensor1 = x;
	sensor2 = y;
	sensor3 = z;
		rules.Works(sensor1);
		jarakKiri  = rules.Hasilnya();
		rules.Works(sensor2);
		jarakKanan = rules.Hasilnya();
		rules.Works(sensor3);
		jarakDepan = rules.Hasilnya();
	
	}
	
	public String sensorkiri(){
		return jarakKiri;
	}
	public String sensorKanan(){
		return jarakKanan;
	}
	public String sensorDepan(){
		return jarakDepan;
	}
		
}
