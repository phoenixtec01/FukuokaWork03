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

			for (Object arg : comParse.getArgs()) {
				if (arg.equals("入荷予定")) {
					//入荷予定の処理を呼び出す
					System.out.println("入荷予定です");
					return;
				} else if (arg.equals("出荷予定")) {
					//出荷予定の処理を呼び出す
					return;
				} else if (arg.equals("入庫")) {
					//入庫の処理を呼び出す
					return;
				} else if (arg.equals("出庫")) {
					//出庫の処理を呼び出す
					return;
				}
			}

		} catch (AllException e) {
			System.out.println(e.getErrorMessage());
		}
	}

}