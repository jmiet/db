/**
 * Created by A on 2016-01-27.
 */
public class Watek implements Runnable {
  private String plik;
  static int ile=0;
  public Watek(String nazwa,int i){
	  this.plik=nazwa;
	  Watek.ile++;
  }
  public void run() {
    System.out.println("Watek nr:" + Watek.ile +", " +this.plik );
    try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    Watek.ile--;
  }
}
