package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		//파라미터가 6개인 생성자를 썻으므로 
		//파라미터6개 실행하는데 5개짜리 한테 일을시켜서
		//Song(파라미터5개)가 출력된 다음
		//Song(파라미터6개)가 출력될것이다.
		Song s1 = new Song("좋은날","아이유","Real","이민수","2010",3);
	}

}


