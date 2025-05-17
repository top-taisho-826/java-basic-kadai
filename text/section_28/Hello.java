// Swingのパッケージをインポート
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Hello {
    public static void main(String[] args) {

        // 1.フレームの設定
        JFrame frame = new JFrame("Swing サンプルアプリ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 2.ボタンの作成
        JButton button = new JButton("こんにちは！クリックしてください");
        button.setBounds(50, 50, 200, 30);
        frame.add(button);

        // 3.ポップアップ画面の作成
        button.addActionListener(e -> {
           JOptionPane.showMessageDialog(frame, "Hello World!");
        });

        // 4.フレームの表示
        frame.setVisible(true);
    }
}