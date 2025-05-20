package kadai_015;

public class CarExec_Chapter15 {
	    public static void main(String[] args) {
	        Car_Chapter15 car = new Car_Chapter15();
	        car.gearChange(1); // ギア1
	        car.gearChange(3); // ギア3
	        car.gearChange(6); // ギア範囲外（時速10kmに設定される）
	        car.run();
	    }
	}