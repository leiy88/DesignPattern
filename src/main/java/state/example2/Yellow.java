package state.example2;

public class Yellow implements State {

	@Override
	public void next(Context context) {
		System.out.println("**黄灯等**");
		context.setCurrentState(new Red());
	}

}
