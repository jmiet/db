
/**
 * Created by A on 2016-01-27.
 */

import java.util.ArrayList;
public class wsp {
	public int sem_i;
	private String[] pliki;
	private int max;
	ArrayList<String> list = new ArrayList<>();
	public void wsp(int i){
		sem_i=0;
		list.clear();
		max=i;
	};
	public synchronized int dodaj(String fn){
		if (!list.contains(fn) && (sem_i<max)){
			list.add(fn);
			sem_i++;
		};
		return sem_i;
	}
	public synchronized int ile(){
		return sem_i;
	};
	public synchronized void zmniejsz(String fn){
		list.remove(fn);
		sem_i--;
	}
	
}
