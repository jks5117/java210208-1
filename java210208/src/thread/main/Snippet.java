package thread.main;

public class Snippet {
	Runnable r1 = new MyRunningOne();
	Thread th = new Thread(r1);
	th.start();
}

