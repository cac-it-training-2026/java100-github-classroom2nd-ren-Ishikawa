/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		int inum1 = Integer.parseInt(str1);
		int inum2 = Integer.parseInt(str2);
		int inum3 = Integer.parseInt(str3);

		System.out.println("合計個数    " + (inum1 + inum2 + inum3) + "個");
		System.out.println("合計金額  " + (inum1 * 250 + inum2 * 280 + inum3 * 320) + "円");

		System.out.println("をお買い上げですね。");
		System.out.println("承りました。");

		int a = 30 - inum1;
		int b = 30 - inum2;
		int c = 30 - inum3;

		System.out.println("本日のおすすめ商品です。");
		System.out.println("シトロン      \\250 ・・・ 残り" + a + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + b + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + c + "個");

	}

}