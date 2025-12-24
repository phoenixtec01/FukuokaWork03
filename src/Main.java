
public class Main {

	public static void main(String[] args) {

		try {
			throw new AllException(AllException.ErrorCode.ALLOWABLENUM_ERROR);
		} catch (AllException e) {
			System.out.println("模擬出力：" + e.getErrorMessage());
		}
	}

}
