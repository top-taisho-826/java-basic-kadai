package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    public KatoTaro_Chapter18() {
        // ここでは何もしないか、必要ならデフォルトの名前を設定できます。
        // 例えば: this.setGivenName("太郎");
    }

    public void setGivenName() {
        this.givenName = givenName;
    }

    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}