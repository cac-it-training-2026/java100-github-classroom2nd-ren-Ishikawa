/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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
		int buyall = (int) (dnum1 + dnum2 + dnum3);

		System.out.println("売り上げの割合\n売上合計　　　\\" + all);
		System.out.println();
		System.out.println("内訳\nシトロン      \\" + pay1 + "   " + ((pay1 * 100) / all + "%"));
		System.out.println("ショコラ      \\" + pay2 + "   " + ((pay2 * 100) / all + "%"));
		System.out.println("ピスターシュ      \\" + pay3 + "   " + ((pay3 * 100) / all + "%"));
		System.out.println();
		System.out.println("明日の三食マカロンの配合率が決まりました。!");
		System.out.println("シトロンの味" + "   " + ((pay1 * 100) / all + "%"));
		System.out.println("ショコラの味" + "   " + ((pay2 * 100) / all + "%"));
		System.out.println("ピスターシュの味" + "   " + ((pay3 * 100) / all + "%"));
		System.out.println();
		System.out.println("が楽しめます。");
		System.out.println();
		System.out.println("値段は、\\" + (pay1 + pay2 + pay3) / buyall + "です。");

	}
}