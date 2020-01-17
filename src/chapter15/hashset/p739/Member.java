package chapter15.hashset.p739;

public class Member {
	public String n;
	public int a;
	
	public Member(String n,int a) {
		this.n=n;
		this.a=a;
		
		
	}

	@Override
	public int hashCode() {
		return n.hashCode()+a;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member m =(Member) obj;
			return m.n.equals(n)&&(m.a==a);
		} else 
			return false;
	}
}
