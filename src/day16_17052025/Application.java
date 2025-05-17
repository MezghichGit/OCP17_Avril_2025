package day16_17052025;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

	public static void main(String[] args) throws URISyntaxException {
		// méthode 1 pour avoir un objet Path via Paths.get()
		Path path1 = Paths.get("pandas","cuddly.png");
		Path path2 = Paths.get("c:","zooinfo","November","employees.txt");
		Path path3 = Paths.get("/","home","zoodirector");
		// méthode 2 pour avoir un objet Path via Paths.get() via URI
		Path path31 = Paths.get(new URI("file:///home/zoodirectory")); 
		Path path4 = Paths.get(new URI("http://www.wiley.com"));
		Path path5 = Paths.get(new URI("ftp://username:password@ftp.the-ftp-server.com"));
		Path path41 = Paths.get(new URI("http://www.wiley.com"));
		URI uri4 = path4.toUri();
		// méthode 3 via FileSystem.getPath()
		Path path10 = FileSystems.getDefault().getPath("pandas/cuddly.png");
		FileSystem fileSystem = FileSystems.getFileSystem(new URI("http://www.selikoff.net"));
		Path path = fileSystem.getPath("duck.txt");
		// méthode 4 via la méthode toPath() de la classe File
		File file = new File("pandas/cuddly.png");
		Path path21 = file.toPath();
		Path path22 = Paths.get("cuddly.png");
		File file21 = path.toFile(); 



	}

}
