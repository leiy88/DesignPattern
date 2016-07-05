package state.example1;

public class Expert implements State {

	@Override
	public void canDo(Context context) {
		 System.out.println("积分>500 处于专家状态，可以留言、回复、下载、双倍积分");

	}

}
