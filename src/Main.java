
public class Main {

	public static void main(String[] args) {

		try {
			new CommandParse(args);
		} catch (AllException e) {
			System.out.println(e.getErrorMessage());
		}
	}

}