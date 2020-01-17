package chapter06;

public class User {
	String id; //userId
	int lv; //level
	
	User(){
		id = "guest";
		lv = 0;
	}
	
	User(String Id){
		id = Id;
	}
	
	User(String Id, int l){
		id = Id;
		lv = l;
	}
	
}
