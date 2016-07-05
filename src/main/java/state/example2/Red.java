package state.example2;

public class Red implements State {

	@Override
	public void next(Context context) {
		System.out.println("**红灯停**");
		context.setCurrentState(new Green());
	}

}
