package rules;
import java.util.Random;
public class TestJalan {
	boolean check;
	String belokan;
	float[] sensorKiri = new float[100];
	float[] sensorKanan = new float[100];
	float[] sensorDepan = new float[100];
	String x;
	boolean[] step = new boolean[100];
	String[] warna = new String[100];
	int[] nilaiWarna = new int[100];
	color color = new color();
	String tempWarna;

	public void jalanBenar(String input) {
		Random random = new Random();
		float value = random.nextFloat()*6;
		int i=0;
		do{
			
		sensorKiri[i]=random.nextFloat()*6;
		sensorKiri[i]=random.nextFloat()*6;
		sensorKiri[i]=random.nextFloat()*6;
		sensorKanan[i]=random.nextFloat()*6;
		sensorKanan[i]=random.nextFloat()*6;
		sensorKanan[i]=random.nextFloat()*6;
		sensorDepan[i]=random.nextFloat()*6;
		sensorDepan[i]=random.nextFloat()*6;
		sensorDepan[i]=random.nextFloat()*6;
		nilaiWarna[i] = random.nextInt(3);
		
		if(nilaiWarna[i]==0){
			warna[i]="merah";
		}else if(nilaiWarna[i]==1){
			warna[i]="kuning";
		}else
			if(nilaiWarna[i]==2){
				warna[i]="hijau";
			}
		
		i++;
		}while(i<=99);
		i=2;
		while(check=true){
			Sensor sensor = new Sensor();
			turn belok = new turn();
			float x=sensorKiri[i-2];
			float z=sensorDepan[i-2];
			float y=sensorKanan[i-2];
			sensor.Sensor1(x,y,z);
			belok.belok(sensor.sensorkiri(),sensor.sensorKanan(),sensor.sensorDepan());
			System.out.println("STEP "+(i-2));
			System.out.print("Sensor Kiri : "+sensor.sensorkiri()+"  |  ");
			System.out.print("Sensor Kanan : "+sensor.sensorKanan()+"  |  ");
			System.out.print("Sensor Depan : "+sensor.sensorDepan()+"  |  ");
			System.out.println(belok.Arahnya()+" | "+warna[i]);
	
			color.warna(input);
			if(input.equals(warna[i])&&warna[i-1].equals(color.warnax[1]) && warna[i-2].equals(color.warnax[0])){
				break;
			}
			
			
			
			System.out.println();
			i=i+1;
		};
		
			
		
		for(i=0;i<=3;i++){
			
		}
	
	}

}
