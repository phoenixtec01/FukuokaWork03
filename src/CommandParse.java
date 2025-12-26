import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//コマンドライン引数解析クラス
public class CommandParse {

	private CommandOption option;
	private List<Object> argsList = new ArrayList<>();

	public CommandParse(String[] args, Map<String, CommandOption> optionMap) throws AllException {
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];

			if (arg.startsWith("-")) {
				option = optionMap.get(arg);

			} else {

				argsList.add(arg);

				int afterCount = args.length - (i + 1); //現在地より後ろの引数を数える

				if ("入荷予定".equals(arg) || "出荷予定".equals(arg)) {
					if (afterCount != 4) {
						throw new AllException(AllException.ErrorCode.PARAMETER_ERROR);
					}
				}

				if ("入庫".equals(arg) || "出庫".equals(arg)) {
					if (afterCount != 1) {
						throw new AllException(AllException.ErrorCode.PARAMETER_ERROR);
					}
				}
			}
		}
		System.out.println(argsList);
	}
}
