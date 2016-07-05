package interpreter;

import java.util.HashMap;

public class VarExpression extends Expression {
	
	
	//通常终结符表达式只有一个，但是有多个对象
	
	private String key;
	
	public VarExpression(String key){
		this.key = key;
	}
	
	public int interpreter(HashMap<String, Integer> var) {
		  
		return var.get(this.key);
		  
	}

}
