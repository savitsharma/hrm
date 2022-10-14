package main;



public class Lambda {

	public static void main(String[] args) {
	
//		Test i=new Test();
//		Runnable r=i::exp;
//		Thread tr=new Thread(r);
//		tr.start();
//		for(int j=0;j<10;j++) {
//		System.out.println("runnnnn");
		
		Inter r=Test::new;
		Test test=r.m1("svit","bareilly",998);
		test.getClass();
	}
	}