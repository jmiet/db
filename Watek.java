import java.io.File;
public class Watek implements Runnable {
  private String plik;
  private int nr=0;  // ile watkow teraz
  private wsp pe;
  public Watek(wsp e,String nazwa ){
	  pe=e;
	  e.dodaj(nazwa);
	  this.plik=nazwa;
	  nr=e.ile();
  }
  public void run() {
    System.out.println("Watek nr:" + pe.ile() +", plik" + plik );
   	File file = new File("c:\\logfile20100131.log");
	if(file.delete()){
		System.out.println(file.getName() + " is deleted!");
	    pe.zmniejsz(plik);
	}else{
		System.out.println("Delete operation is failed.");
	};

    try {
		Thread.sleep(10);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	};
  };
}
