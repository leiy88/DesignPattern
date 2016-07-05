package builder.refactor;

public class SamsungPhoneBuilder implements Builder {

	private Phone phone = new SamsungPhone();
	
	public void buildCPU() {
		phone.add("CUP: MTK"); 
	}

	public void buildScreen() {
		phone.add("SCREEN: Samsung");
	}

	public void buildBattery() {
		phone.add("BATTERY: DeSai");
	}

	public Phone getPhone() {
		return phone;
	}

}
