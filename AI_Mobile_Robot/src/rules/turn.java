package rules;

public class turn {
	float motor1, motor2;
	String warna, arah;
	String[] step = new String[100];
	int i = 1;

	public void belok(String x, String y, String z) {
		

		if (x == "dekat" && y == "dekat" && z == "dekat") {
			arah = "balik arah";
		}else

		if (x == "dekat" && y == "dekat" && z == "cukup dekat") {
			arah = "maju";
		}else

		if (x == "dekat" && y == "dekat" && z == "jauh") {
			arah = "maju";
		}else
		if (x == "dekat" && y == "dekat" && z == "sangat jauh") {
			arah = "maju";
		}else

		/////////////////////////////////////////////////////////////////////////

		if (x == "dekat" && y == "cukup dekat" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "cukup dekat" && z == "cukup dekat") {
			arah = "maju";
		}else 

		if (x == "dekat" && y == "cukup dekat" && z == "jauh") {
			arah = "maju";
		}else
		if (x == "dekat" && y == "cukup dekat" && z == "sangat jauh") {
			arah = "maju";
		}else

		///////////////////////////////////////////////////////////////////////
			
		if (x == "dekat" && y == "jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "jauh" && z == "jauh") {
			arah = "belok kanan";
		}else
		if (x == "dekat" && y == "jauh" && z == "sangat jauh") {
			arah = "maju";
		}else

		////////////////////////////////////////////////////////////////////////
			
		if (x == "dekat" && y == "sangat jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "sangat jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "sangat jauh" && z == "jauh") {
			arah = "belok kanan";
		}else
		if (x == "dekat" && y == "sangat jauh" && z == "sangat jauh") {
			arah = "belok kanan";
		}else
		
		////////////////////////////////////////////////////////////////////////
			
		if (x == "dekat" && y == "sangat jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "sangat jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "dekat" && y == "sangat jauh" && z == "jauh") {
			arah = "belok kanan";
		}else
		if (x == "dekat" && y == "sangat jauh" && z == "sangat jauh") {
			arah = "belok kanan";
		}else
			
		////////////////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////
			
		if (x == "cukup dekat" && y == "dekat" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "cukup dekat" && y == "dekat" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "cukup dekat" && y == "dekat" && z == "jauh") {
			arah = "maju";
		}else
		if (x == "cukup dekat" && y == "dekat" && z == "sangat jauh") {
			arah = "maju";
		}else
			
		/////////////////////////////////////////////////////////////////////
		
		if (x == "cukup dekat" && y == "cukup dekat" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "cukup dekat" && y == "cukup dekat" && z == "cukup dekat") {
			arah = "maju";
		}else 
		if (x == "cukup dekat" && y == "cukup dekat" && z == "jauh") {
			arah = "maju";
		}else
		if (x == "cukup dekat" && y == "cukup dekat" && z == "sangat jauh") {
			arah = "maju";
		}else
			
		///////////////////////////////////////////////////////////////////////
			
		if (x == "cukup dekat" && y == "jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "cukup dekat" && y == "jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "cukup dekat" && y == "jauh" && z == "jauh") {
			arah = "belok kanan";
		}else
		if (x == "cukup dekat" && y == "jauh" && z == "sangat jauh") {
			arah = "maju";
		}else
			
		//////////////////////////////////////////////////////////////////////
			
		if (x == "cukup dekat" && y == "sangat jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "cukup dekat" && y == "sangat jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "cukup dekat" && y == "sangat jauh" && z == "jauh") {
			arah = "belok kanan";
		}else
		if (x == "cukup dekat" && y == "sangat jauh" && z == "sangat jauh") {
			arah = "belok kanan";
		}else
		
		///////////////////////////////////////////////////////////////////////
			
		if (x == "jauh" && y == "dekat" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "jauh" && y == "dekat" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "jauh" && y == "dekat" && z == "jauh") {
			arah = "belok kiri";
		}else
		if (x == "jauh" && y == "dekat" && z == "sangat jauh") {
			arah = "maju";
		}else
				
			/////////////////////////////////////////////////////////////////////
			
		if (x == "jauh" && y == "cukup dekat" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "jauh" && y == "cukup dekat" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "jauh" && y == "cukup dekat" && z == "jauh") {
			arah = "belok kiri";
		}else
		if (x == "jauh" && y == "cukup dekat" && z == "sangat jauh") {
			arah = "maju";
		}else
				
			///////////////////////////////////////////////////////////////////////
				
		if (x == "jauh" && y == "jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "jauh" && y == "jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "jauh" && y == "jauh" && z == "jauh") {
			arah = "maju";
		}else
		if (x == "jauh" && y == "jauh" && z == "sangat jauh") {
			arah = "maju";
		}else
				
			//////////////////////////////////////////////////////////////////////
				
		if (x == "jauh" && y == "sangat jauh" && z == "dekat") {
			arah = "belok kanan";
		}else 
		if (x == "jauh" && y == "sangat jauh" && z == "cukup dekat") {
			arah = "belok kanan";
		}else 
		if (x == "jauh" && y == "sangat jauh" && z == "jauh") {
			arah = "belok kanan";
		}else
		if (x == "jauh" && y == "sangat jauh" && z == "sangat jauh") {
			arah = "belok kanan";
		}else
			
			//////////////////////////////////////////////////////////////////////
		
		if (x == "sangat jauh" && y == "dekat" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "dekat" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "dekat" && z == "jauh") {
			arah = "belok kiri";
		}else
		if (x == "sangat jauh" && y == "dekat" && z == "sangat jauh") {
			arah = "belok kiri";
		}else
					
				/////////////////////////////////////////////////////////////////////
				
		if (x == "sangat jauh" && y == "cukup dekat" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "cukup dekat" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "cukup dekat" && z == "jauh") {
			arah = "belok kiri";
		}else
		if (x == "sangat jauh" && y == "cukup dekat" && z == "sangat jauh") {
			arah = "belok kiri";
		}else
					
			///////////////////////////////////////////////////////////////////////
					
		if (x == "sangat jauh" && y == "jauh" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "jauh" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "jauh" && z == "jauh") {
			arah = "belok kiri";
		}else
		if (x == "sangat jauh" && y == "jauh" && z == "sangat jauh") {
			arah = "belok kiri";
		}else
					
				//////////////////////////////////////////////////////////////////////
					
		if (x == "sangat jauh" && y == "sangat jauh" && z == "dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "sangat jauh" && z == "cukup dekat") {
			arah = "belok kiri";
		}else 
		if (x == "sangat jauh" && y == "sangat jauh" && z == "jauh") {
			arah = "belok kiri";
		}else
		if (x == "sangat jauh" && y == "sangat jauh" && z == "sangat jauh") {
			arah = "maju";
		}
			
	}
	
	public String Arahnya(){
		return arah;
	}
	
}
