package kadai_015;

//車クラス
public class Car_Chapter15 {
 // フィールド（内部データ）
 private int gear =  1;    // 1速から5速のギアを表す
 private int speed = 10;    // ギアチェンジ後の速度を表す    

 // コンストラクタ（初期化処理）
 public Car_Chapter15() {
     this.gear = gear;
     this.speed = speed;
 }

 public int getGear() {
     return this.gear;
 }

 public int getSpeed() {
     return this.speed;
 }

 // メソッド定義
 public void gearChange(int afterGear) {
     this.gear = afterGear;
     // ギアの値により速度を変える
     this.speed = switch (this.gear) {
         case 1 -> 10;
         case 2 -> 20;
         case 3 -> 30;
         case 4 -> 40;
         case 5 -> 50;
         default -> 10;
     };
 }

 public void run() {
     System.out.println("ギア" + this.gear + "から" + this.gear + "に切り替えました");
     System.out.println("速度は時速" + this.getSpeed() + "kmです");
 }
}