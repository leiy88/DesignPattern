package state.example1;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		Context context = new Context();
		State state=null;
		int jifen=200;
		
		if(jifen<100){
			state = new Fresh();
		}else if(jifen<500){
			state = new Master();
		}else{
			state = new Expert();
		}
		
		context.setCurrentState(state);
		context.canDo();
	}
}
