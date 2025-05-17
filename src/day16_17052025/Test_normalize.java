package day16_17052025;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test_normalize {

	public static void main(String[] args) throws IOException {
		NoSuchFileException e;
		Path path3 = Paths.get("E:\\data");
		Path path4 = Paths.get("E:\\user\\home");
		Path relativePath = path3.relativize(path4);
		System.out.println(relativePath);
		System.out.println(path3.resolve(relativePath));
		System.out.println(path3.resolve(relativePath).normalize());
		System.out.println(Paths.get(".").toRealPath());
		System.out.println(path3.resolve(relativePath).normalize().toRealPath());
	}

}
