package state.example2;

public class Test {
	public static void main(String[] args) {
		Context context=new Context();
		context.setCurrentState(new Red());
		while(true){
			context.next();
		}
	}
}
