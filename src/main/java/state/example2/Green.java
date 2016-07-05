package state.example2;

public class Green implements State {

	@Override
	public void next(Context context) {
		System.out.println("**绿灯行**");
		context.setCurrentState(new Yellow());
	}

}
