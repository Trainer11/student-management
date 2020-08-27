package com.singleton;
//second commits
public class SingleTon {

	//Have a private static instance variable
	private static SingleTon ston;
	
	//Make your constructor private
	private SingleTon() {
		// TODO Auto-generated constructor stub
	}
	
	//Have a method which will create one instance and share to various objects
	public static SingleTon createSingleTonObject() {
		if(ston == null) {
			ston=new SingleTon();
		}
		return ston;
	}
}
