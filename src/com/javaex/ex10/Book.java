package com.javaex.ex10;

public class Book {
	
	public static int number;
	public static String name;
	public static String writer;
	public static boolean rent;
	
	
	public Book(int no,String n,String w) {
		this.number=no;
		this.name=n;
		this.writer=w;
		
	}
	public Book() {
		
	}
	
	public static boolean isRent() {
		return rent;
	}
	public static void setRent(boolean rent) {
		Book.rent = rent;
	}
	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Book.number = number;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Book.name = name;
	}

	public static String getWriter() {
		return writer;
	}

	public static void setWriter(String writer) {
		Book.writer = writer;
	}

    
	public static void displayBookInfo(Book[] a) {
		for(int i=0;i<=9;i++) {
			Book b = new Book();
			b=a[i];
			System.out.print(number+1+"책 제목:"+name+" 작가: "+writer+" 재고:");
			if(rent==true) {
				System.out.println(" 재고있음.");
			}
			else {
				System.out.println(" 재고없음.");
			}
		}
	}
	public static void rent(Book[] a) {
		
	}
    
    
    
    
}
