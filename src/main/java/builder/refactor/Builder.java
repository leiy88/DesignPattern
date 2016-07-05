package builder.refactor;

public interface Builder {
	public void buildCPU();

    public void buildScreen();

    public void buildBattery();

    public Phone getPhone();
}
