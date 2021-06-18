package echo.ex03;

public class Multithread {
	
	public static void main(String[] args) {
		//시간순 --> 각자 독립적으로 thread
		
		Thread thread01 = new DigitThread();
		Thread thread02 = new LowerThread();
		Thread thread03 = new UpperThread();
		
		thread01.start();
		thread02.start();
		thread03.start();
		
		
		
	}

}
