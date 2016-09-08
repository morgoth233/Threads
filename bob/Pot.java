package bob;

public class Pot {
	
	 private static final int MAX_BOB = 500;
	 private static final int MIN_BOB = 50;

	 int BOB = 200;
	
	 public synchronized void hapniBob(int izqdenBob){
			if(BOB <=Pot.MIN_BOB){
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			BOB-=izqdenBob;
			notifyAll();
			System.out.println(Thread.currentThread().getName() + "Hapna bob, ostava " + BOB);
		}
	 
	 public synchronized void sipiBob(int newBob){
			if(BOB >=Pot.MAX_BOB){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			BOB+=newBob;
			notifyAll();
			System.out.println("Sipahme bob, ostava " + BOB);
		}

	
}
