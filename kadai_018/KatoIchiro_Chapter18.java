package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    public KatoIchiro_Chapter18() {
        // this.setGivenName("一郎"); // コンストラクタでデフォルト設定しても良い
    }

    public void setGivenName() {
        this.givenName = givenName;
    }

    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}