package observer.example1;

public class  Customer implements Observer {
	private String nickName;
	public Customer(String nickName){
		this.setNickName(nickName);
	}
	@Override
	public void upadte(String info) {
		System.out.println("亲爱的"+this.getNickName()+"您关注的店"+info);
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
