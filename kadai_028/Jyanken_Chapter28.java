package kadai_028;

import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力してください (グー、チョキ、パー):");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toLowerCase();

        switch (input) {
            case "グー":
            case "チョキ":
            case "パー":
                return input;
            default:
                System.out.println("無効な入力です。");
                return getMyChoice(); // 再度入力を促す（再帰呼び出し）
        }
    }

    public String getRandom() {
        String[] choices = {"グー", "チョキ", "パー"};
        int randomIndex = (int) Math.floor(Math.random() * 3);
        String randomChoice = choices[randomIndex];
        System.out.println("相手の手は: " + randomChoice);
        return randomChoice;
    }

    public void playGame() {
        String myChoice = getMyChoice();
        String opponentChoice = getRandom();

        System.out.println("あなたの手は: " + myChoice);

        if (myChoice.equals(opponentChoice)) {
            System.out.println("あいこです");
        } else if ((myChoice.equals("グー") && opponentChoice.equals("チョキ")) ||
                   (myChoice.equals("チョキ") && opponentChoice.equals("パー")) ||
                   (myChoice.equals("パー") && opponentChoice.equals("グー"))) {
            System.out.println("あなたの勝ちです");
        } else {
            System.out.println("あなたの負けです");
        }
    }
}