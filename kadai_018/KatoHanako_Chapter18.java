package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    public KatoHanako_Chapter18() {
        // this.setGivenName("花子"); // コンストラクタでデフォルト設定しても良い
    }

    public void setGivenName() {
        this.givenName = givenName;
    }

    @Override
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}