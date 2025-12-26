import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//コマンドライン引数解析クラス
public class CommandParse {

	private CommandOption option;
	private List<Object> argsList = new ArrayList<>();

	public CommandParse(String[] args, Map<String, CommandOption> optionMap) throws AllException {
		for (String arg : args) {
			if (arg.startsWith("-")) {
				option = optionMap.get(arg);
			} else {
				argsList.add(arg);
			}
		}

		boolean result = true; //false=例外出力
		for (int i = 0; i < args.length; i++) {
	        int afterCount = args.length - (i + 1);
	        if ("入荷予定".equals(args[i])) {
		        if (afterCount != 4) {
		        	result = false;
		        }
		        break;
		    }
		}
				
		if (!result) {
			throw new AllException(AllException.ErrorCode.PARAMETER_ERROR);
		}
	}
}
