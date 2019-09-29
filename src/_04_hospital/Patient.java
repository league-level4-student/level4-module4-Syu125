package _04_hospital;

public class Patient extends Hospital{
	boolean feelsCaredFor;
	Patient(){
		
	}
	
	void checkPulse() {
		feelsCaredFor = true;
	}
	boolean feelsCaredFor() {
		return feelsCaredFor;
		
	}
}
