
//例外処理クラス
public class AllException extends Exception {
	public enum ErrorCode {
		PARAMETER_ERROR,
		OPTION_ERROR,
		EXPECTEDNUM_ALREADY_ERROR,
		EXPECTEDNUM_NOT_FOUND_ERROR,
		ALLOWABLENUM_ERROR,
		RACK_ERROR,
		STOCK_ERROR,
		DATE_ERROR,
		PRODUCT_ID_ERROR,
		QUANTITY_ERROR,
		INPUT_NODATA_ERROR,
		OUTPUT_NODATA_ERROR,
		ALREADY_STOCK_ERROR,
		ALREADY_SHIPPED_ERROR,
		INPUT_PLAN_ERROR,
		OUTPUT_PLAN_ERROR,
		INPUT_ERROR,
		OUTPUT_ERROR
	}

	private ErrorCode errorCode;

	public AllException(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		switch (errorCode) {
		case PARAMETER_ERROR:
			return "パラメータが不足しています。";
		case OPTION_ERROR:
			return "オプションのエラーです。";
		case EXPECTEDNUM_ALREADY_ERROR:
			return "予定番号が登録されています。";
		case EXPECTEDNUM_NOT_FOUND_ERROR:
			return "予定番号が登録されていません。";
		case ALLOWABLENUM_ERROR:
			return "引当可能数が不足しています。";
		case RACK_ERROR:
			return "棚が空いていません。";
		case STOCK_ERROR:
			return "在庫が不足しています。";
		case DATE_ERROR:
			return "日付が正しくありません。";
		case PRODUCT_ID_ERROR:
			return "商品コードが登録されていません。";
		case QUANTITY_ERROR:
			return "数量が正しくありません。";
		case INPUT_NODATA_ERROR:
			return "入荷予定データが登録されていません。";
		case OUTPUT_NODATA_ERROR:
			return "出荷予定データが登録されていません。";
		case ALREADY_STOCK_ERROR:
			return "入庫済みです。";
		case ALREADY_SHIPPED_ERROR:
			return "出庫済みです。";
		case INPUT_PLAN_ERROR:
			return "入荷予定データの登録に失敗しました。";
		case OUTPUT_PLAN_ERROR:
			return "出荷予定データの登録に失敗しました。";
		case INPUT_ERROR:
			return "入庫に失敗しました。";
		case OUTPUT_ERROR:
			return "出庫に失敗しました。";
		default:
			return "エラーが発生しました。";
		}
	}
}
