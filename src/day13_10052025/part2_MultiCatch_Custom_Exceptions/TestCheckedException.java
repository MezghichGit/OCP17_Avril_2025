package day13_10052025.part2_MultiCatch_Custom_Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class TestCheckedException {

	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		}
		/*catch (NullPointerException e){
			
		}*/
		
		catch (SQLException e){
			
		}
		
		catch (IOException e){
			
		}

	}

}
