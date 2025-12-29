import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		try {
	        Map<String, CommandOption> optionMap = new HashMap<>();
	        optionMap.put("-b", new BOption());
	        optionMap.put("-c", new COption());
	        
			CommandParse comParse = new CommandParse(args, optionMap);
			CommandOption comOp = comParse.getOption();
			comOp.printMessage();
			System.out.println("オプション：" + comOp.printMessage());
			System.out.println("引数：" + comParse.getArgs());
			
		} catch (AllException e) {
			System.out.println(e.getErrorMessage());
		}
	}

}