package chapter15.exercise.n08;


public class St {
	public int nu;
	public String n;
	
	public St(int nu, String n) {
		this.nu=nu;
		this.n=n;
	}

	
	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		St x = (St) obj;
		return this.nu==x.nu||this.n.equals(x.n);
	}
}
	
	

