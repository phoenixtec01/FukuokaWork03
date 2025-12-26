import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		try {
	        Map<String, CommandOption> optionMap = new HashMap<>();
			new CommandParse(args, optionMap);
		} catch (AllException e) {
			System.out.println(e.getErrorMessage());
		}
	}

}