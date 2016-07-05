package state.example1;

public class Master implements State {

	@Override
	public void canDo(Context context) {
		System.out.println("100<积分<500 处于高手状态，可以留言、回复、下载文档");
	}

}
