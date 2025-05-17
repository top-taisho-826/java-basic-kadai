package text.section_24;

public class Exception_Test1 {

	public static void main(String[] args) {
		//配列の宣言
		int[] number = new int[1];

		try {
			number[0] = 1;
			number[1] = 2;
		} catch (ArrayIndexOutOfBoundsException e) {
			//配列のインデックスが範囲外の場合に行う処理
			System.out.println("配列のインデックスが範囲外です");
		}

		System.out.println("処理終了です");
	}

}