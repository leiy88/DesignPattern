package builder.refactor;

public class ApplePhoneBuilder implements Builder {

	private Phone phone = new ApplePhone();
	
	public void buildCPU() {
		phone.add("CUP: Qualcomm");
	}

	public void buildScreen() {
		phone.add("SCREEN: JDI");
	}

	public void buildBattery() {
		phone.add("BATTERY: DeSai");
	}

	public Phone getPhone() {
		return phone;
	}

}
