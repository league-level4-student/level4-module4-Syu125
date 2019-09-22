package _04_hospital;


public class Doctor extends Hospital{
	private boolean performsSurgery;
	private boolean makesHouseCalls;
	
	Doctor() {
	}

	Doctor(boolean performsSurgery, boolean makesHouseCalls) {
		this.performsSurgery = performsSurgery;
		this.makesHouseCalls = makesHouseCalls;
	}

	boolean performsSurgery() {
		return performsSurgery;

	}

	void setperformsSurgery(boolean b) {
		this.performsSurgery = b;
	}

	boolean makesHouseCalls() {
		return makesHouseCalls;

	}
	
	
}
