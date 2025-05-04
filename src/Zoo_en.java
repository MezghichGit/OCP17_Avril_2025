import java.util.ListResourceBundle;

public class Zoo_en extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return new Object[][] { 
			{ "hello", "Hello java class" }, 
			{ "open", "The zoo is open java class" } };
	}

}
