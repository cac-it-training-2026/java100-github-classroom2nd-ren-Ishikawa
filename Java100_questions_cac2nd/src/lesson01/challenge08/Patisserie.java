/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String str1 = reader.readLine();
		System.out.print("ショコラ      >");
		String str2 = reader.readLine();
		System.out.print("ピスターシュ  >");
		String str3 = reader.readLine();

		System.out.println("シトロン     " + str1 + "個");
		System.out.println("ショコラ     " + str2 + "個");
		System.out.println("ピスターシュ " + str3 + "個");

		double dnum1 = Double.parseDouble(str1);
		double dnum2 = Double.parseDouble(str2);
		double dnum3 = Double.parseDouble(str3);

		System.out.println("合計個数    " + (dnum1 + dnum2 + dnum3) + "個");
		System.out.println("合計金額  " + (int) (dnum1 * 250 + dnum2 * 280 + dnum3 * 320) + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		int a = (int) (30 - dnum1);
		int b = (int) (30 - dnum2);
		int c = (int) (30 - dnum3);

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + a + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c + "個");

		System.out.println("閉店時間となりました。\nまたのお越しをお待ちしております。\n");

		int all = (int) (dnum1 * 250 + dnum2 * 280 + dnum3 * 320);

		int pay1 = (int) (dnum1 * 250);
		int pay2 = (int) (dnum2 * 280);
		int pay3 = (int) (dnum3 * 320);

		System.out.println("売り上げの割合\n売上合計　　　\\" + all);
		System.out.println();
		System.out.println("内訳\nシトロン      \\" + pay1 + "   " + ((pay1 * 100) / all + "%"));
		System.out.println("ショコラ      \\" + pay2 + "   " + ((pay2 * 100) / all + "%"));
		System.out.println("ピスターシュ      \\" + pay3 + "   " + ((pay3 * 100) / all + "%"));

	}
}
