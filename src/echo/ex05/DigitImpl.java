package echo.ex05;

public class DigitImpl implements Runnable {

	public void run() { // 우리로직 코드 반드시 run()에 작성해야함

		for (int i = 0; i <= 9; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}