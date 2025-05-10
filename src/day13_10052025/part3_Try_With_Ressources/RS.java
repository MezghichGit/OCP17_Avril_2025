package day13_10052025.part3_Try_With_Ressources;

import java.io.Closeable;
import java.io.IOException;

public class RS implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("RS Closed");
		
	}

}
