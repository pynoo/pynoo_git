package chapter08.exercise.n04;

public class Exam {
	public static void dw(Dao dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dw(new Od());
		dw(new Md());
	}
}
