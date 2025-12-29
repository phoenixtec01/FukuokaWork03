import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		try {
	        Map<String, CommandOption> optionMap = new HashMap<>();
			CommandParse comParse = new CommandParse(args, optionMap);
			System.out.println("オプション：" + comParse.getOption());
			System.out.println("引数7：" + comParse.getArgs());
		} catch (AllException e) {
			System.out.println(e.getErrorMessage());
		}
	}

}