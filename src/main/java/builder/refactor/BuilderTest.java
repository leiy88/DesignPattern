package builder.refactor;

public class BuilderTest {
	private static Builder iPhoneBuilder = new ApplePhoneBuilder();
    private static Builder samPhoneBuilder  = new SamsungPhoneBuilder();

    public static void main(String[] args) {
        Director director = new Director(iPhoneBuilder);
        director.construct();
        Phone phone = iPhoneBuilder.getPhone();
        System.out.println("iphone");
        phone.show();

        director = new Director(samPhoneBuilder);
        director.construct();
        phone = samPhoneBuilder.getPhone();
        System.out.println("\nsamSung");
        phone.show();
    }
}
