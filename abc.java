import java.io.File;

public class abc {
	public static void main(String[] args) {
		int max;
		int ile;
		wsp ele;
		max = 3;      // ile watkow max
		ile = 0;
		String kat;

		File file = null;
		File f =null;
		String[] paths;
		String npliku;
ele=new wsp();
		try {
			// create new file object
			kat="/tmp";
		     // create new file
	         f = new File("/tmp/test.txt");
	         
	         // tries to create new file in the system
	          f.createNewFile();
	         
	 
			file = new File(kat);
			if (!file.isDirectory()) {
				System.out.println("To nie katalog  ");
				System.exit(1);
			}
			;
			// array of files and directory
			paths = file.list();

			// for each name in the path array
			for (String path : paths) {
				npliku=kat+"/"+path;
				System.out.println(npliku);
				if (ele.ile()< max)
					(new Thread(new Watek(ele, npliku))).start();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ile++;
			}
		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		};

	}

}
