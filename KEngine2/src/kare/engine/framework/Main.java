package kare.engine.framework;

public class Main {
	public static void main(String[] args) {
		F f=new F();
		Thread thread =new Thread(f);
		thread.run();
	}
}
