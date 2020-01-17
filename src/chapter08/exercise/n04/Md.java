package chapter08.exercise.n04;

public class Md implements Dao {

	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Mysql DB에 삽입");

	}

	@Override
	public void update() {
		System.out.println("Mysql DB를 수정");

	}

	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");

	}

}
