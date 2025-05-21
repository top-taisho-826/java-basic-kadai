package kadai_018;

public abstract class Kato_Chapter18 {
    // 姓フィールド
    public String familyName = "加藤";
    // 名フィールド
    public String givenName;
    // 住所フィールド
    public String address = "東京都中野区〇×";

    // setGivenNameメソッド
    public void setGivenName() {
        this.givenName = givenName;
    }

    // 共通の紹介メソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 各子クラスで具体的に実装する紹介メソッド
    abstract public void eachIntroduce();

    // 紹介の実行メソッド
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println();
    }
}