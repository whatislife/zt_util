package com.zhht.util.list;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {  
	    List<Integer> integers=new ArrayList<Integer>();  
	    integers.add(1);  
	    integers.add(2);  
	    integers.add(3);  
	    integers.add(4);  
	    integers.add(5);  
	    List<List<Integer>> lists=ListUtil.averageAssign(integers, 2);  
	    System.out.println(lists);  
	}  
}
