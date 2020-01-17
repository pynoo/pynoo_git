package chapter15.exercise.n07;

import java.util.ArrayList;
import java.util.List;

public class Bd {
	public List<Bo> getBol(){
		List<Bo> l = new ArrayList<>();
		
		l.add(new Bo("제목1","내용1"));
		l.add(new Bo("제목2","내용2"));
		l.add(new Bo("제목3","내용3"));
		
		return l;
	}
	
}
