import java.io.File;
/**
 * Created by A on 2016-01-27.
 */
public class abc {
	public static void main(String[] args) {
		int max;
		int ile;
		wsp z;
		z = new wsp();
		max = 3;
		ile = 0;

		File file = null;
		String[] paths;

		try {
			// create new file object
			file = new File("/tmp");
			if (!file.isDirectory()) {
				System.out.println("To nie katalog  ");
				System.exit(1);
			}
			;
			// array of files and directory
			paths = file.list();

			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
				if (Watek.ile < max)
					(new Thread(new Watek(path, ile))).start();
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
