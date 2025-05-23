package kadai_018;

public class KatoExec_Chapter18 {

    public static void main(String[] args) {
        Kato_Chapter18 katoTaro = new KatoTaro_Chapter18();
        Kato_Chapter18 katoIchiro = new KatoIchiro_Chapter18();
        Kato_Chapter18 katoHanako = new KatoHanako_Chapter18();

        // setGivenNameを呼び出して、名前を設定
        katoTaro.setGivenName();
        katoIchiro.setGivenName();
        katoHanako.setGivenName();

        katoTaro.execIntroduce();
        katoIchiro.execIntroduce();
        katoHanako.execIntroduce();
    }
}