package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear = 1;
	private int speed = 10;
	
	//コンストラクタ
	public Car_Chapter15(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//メソッド
	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + "afterGear" + "に切り替えました");
	
	
	int speed = switch(afterGear){
		case 1 -> this.speed * 1;
		case 2 -> this.speed * 2;
		case 3 -> this.speed * 3;
		case 4 -> this.speed * 4;
		case 5 -> this.speed * 5;
		default -> 10;
	};

		System.out.println("速度は時速" + speed + "kmです" );		
	}
}
