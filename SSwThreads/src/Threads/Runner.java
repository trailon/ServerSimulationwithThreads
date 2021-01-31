package Threads;

import java.util.Random;

public class Runner implements Runnable {
	Random rand = new Random();
	private volatile boolean running = true;
	private volatile int variable = 0;
	private volatile int istek;
	private volatile int cevap;

	/* TASLAK
	 * public void getInformationOfTypeA(){ Thread t = new Thread(new Runnable() {
	 * public void run() { //do stuff here } }); t.start(); }
	 * 
	 * public void getInformationOfTypeB(){ Thread t = new Thread(new Runnable() {
	 * public void run() { //do stuff here } }); t.start(); }
	 */
	public void getInformationOfTypeA() {

		Thread t = new Thread(new Runnable() {
			public void run() {
				while (running) {
					if (variable < 10000) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						istek = rand.nextInt((100 - 1) + 1) + 1;
						variable = variable + istek;
						cevap = rand.nextInt((50 - 1) + 1) + 1;
						if (cevap >= variable)
							cevap = variable;
						variable = variable - cevap;
						cevap = rand.nextInt((50 - 1) + 1) + 1;
						if (cevap >= variable)
							cevap = variable;
						variable = variable - cevap;
						cevap = rand.nextInt((50 - 1) + 1) + 1;
						if (cevap >= variable)
							cevap = variable;
						variable = variable - cevap / 2;
						if (variable > 10000)
							variable = 10000;
						else if (variable < 0)
							variable = 0;
						MainClass.kapasite.set(0, variable);
					}
				}

			}

		});
		MainClass.kapasite.add(variable);
		MainClass.list.add(t);
	}

	public void getInformationOfTypeB() {
		Thread t = new Thread(new Runnable() {
			int kapasite = 1;

			public void run() {
				int a = Character.getNumericValue(Thread.currentThread().getName().charAt(7));

				kapasite--;
				if (a > 2)
					kapasite = MainClass.temp;
				while (running) {

					try {
						Thread.sleep(500);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (kapasite < 5000) {

						istek = rand.nextInt((50 - 1) + 1) + 1;
						if (istek >= variable)
							istek = variable;
						variable = variable - istek;
						kapasite = kapasite + istek;

						cevap = rand.nextInt((50 - 1) + 1) + 1;
						if (cevap >= kapasite)
							cevap = kapasite;
						kapasite = kapasite - cevap;

						cevap = rand.nextInt((50 - 1) + 1) + 1;
						cevap = cevap * 2 / 3;
						if (cevap >= kapasite)
							cevap = kapasite;
						kapasite = kapasite - cevap;

						if (kapasite < 0)
							kapasite = 0;

						MainClass.kapasite.set(a, kapasite);
						if (MainClass.kapasite.get(a) >= 3500) {
							int temporary = kapasite / 2;
							kapasite = kapasite / 2;
							MainClass.kapasite.set(a, temporary);
							MainClass.temp = temporary;
							MainClass.ctrl = 1;
						}
					}

				}
			}
		});
		MainClass.kapasite.add(variable);
		MainClass.list.add(t);
	}

	@Override
	public void run() {
	}

}