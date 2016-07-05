package state.example1;

public class Fresh implements State{

	@Override
	public void canDo(Context context) {
		System.out.println("积分<100 处于新手状态，可以留言、回复，但是不能下载文档");
		
	}

}
