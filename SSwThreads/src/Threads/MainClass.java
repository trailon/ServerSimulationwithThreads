package Threads;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainClass {
	public static ArrayList<Thread> list = new ArrayList<Thread>();
	public static volatile ArrayList<Integer> kapasite = new ArrayList<Integer>();
	public static int ctrl, index = 0, temp;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// GUI.main(args);
		int i = 3, x = 0;
		Runner thread = new Runner();
		thread.getInformationOfTypeA();
		thread.getInformationOfTypeB();
		thread.getInformationOfTypeB();
		while (true) {
			TimeUnit.MILLISECONDS.sleep(500);
			for (int y = 0; y < kapasite.size(); y++)
				System.out.println(list.get(y).getName() + " Kapasitesi = " + kapasite.get(y));
			if (x == 0) {

				list.get(0).start();
				list.get(1).start();
				list.get(2).start();
				x++;
			}
			if (ctrl == 1) {

				thread.getInformationOfTypeB();
				list.get(i).start();
				System.out.println(
						"@@@@@@@@@@ ARRAY LÝSTTEKÝ THREAD SAYISI ARTTI @@@@@@@@@@  VE BU OLDU -> " + list.size());
				i++;
				ctrl = 0;
				for (int y = 3; y < kapasite.size(); y++) {
					if (kapasite.get(y) == 0) {
						list.get(y).stop();
					}
				}
			}
		}

	}
}