package baseball;

public class BaseBallTeam {

	// フィールド
	private String name; // チーム名
	private int win; // 勝利
	private int lose; // 敗北
	private int draw; // 引分

	// 引数なしのコンストラクタ（念のため記述しただけなので中身は空でOK）
	public BaseBallTeam() {
	}

	// 引数ありのコンストラクタ
	public BaseBallTeam(String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}

	// getRate のメソッド
	public double getRate() {
		double result = (double)this.draw / (this.win + this.lose);
		return result;
	}

	// report のメソッド○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。
	public void report() {

		System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
	}

}
