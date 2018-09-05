package com.renwei.controller;

import java.util.ArrayList;

public class MyController {
	public static <E> void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(324324);
		arrayList.add(43224324);
		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		
	}

}
