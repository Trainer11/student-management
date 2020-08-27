package com.singleton.main;

import com.singleton.SingleTon;

public class SingleTonMain {

	public static void main(String[] args) {
		
		//SingleTon ss = new SingleTon();

		SingleTon s1 = SingleTon.createSingleTonObject();

		System.out.println(s1.hashCode());

		SingleTon s2 = SingleTon.createSingleTonObject();

		System.out.println(s2.hashCode());
		
		//check the hashCode... no matter how many times you access it, you will see the same hashcode.
		
		/*
		 * TIP : 
		 * 1) You can make singleton thread safe by making the method createSingleTonObject() as synchronized.
		 * 2) You can make eager initialization of object by directly doing 
		 * private static SingleTon ston=new SingleTon(); as your JVM does the static first so its eager way.
		 */

	}

}
