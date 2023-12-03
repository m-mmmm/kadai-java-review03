package baseball;

public class Review03 {

	public static void main(String[] args) {
		//
		BaseBallTeam team1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
		team1.report();

		BaseBallTeam team2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
		team2.report();

		BaseBallTeam team3 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
		team3.report();

		BaseBallTeam team4 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
		team4.report();

		BaseBallTeam team5 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
		team5.report();

		BaseBallTeam team6= new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
		team6.report();
	}

}
