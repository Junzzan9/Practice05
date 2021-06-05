package com.javaex.ex09;

public class StringUtil {
	
	static String index="";
    
    public static String concatString(String[] a){
       
        //메소드 내용작성	
    	for(int i=0;i<a.length;i++) {
    		index=index+a[i];
    	}
    	return index;
        
    }

}
