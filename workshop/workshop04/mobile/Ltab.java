package mobile;

public class Ltab extends Mobile{

	// 생성자
	public Ltab() {}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	
	// 메소드
	@Override
	public int operate(int time) { // 사용을 통해 배터리 감소, 1분 사용시 배터리 10감소, 잔여 배터리 리턴
		setBatterySize(getBatterySize()-time*10);
		return getBatterySize();
	}

	@Override
	public int charge(int time) { // 충전을 통한 배터리 증가, 1분 충전시 배터리 10증가, 잔여 배터리 리턴
		setBatterySize(getBatterySize()+time*10);
		return getBatterySize();
	}
	
	@Override
	public String toString() {
		return String.format("%s\t %d\t  %s", getMobileName(), getBatterySize(), getOsType());
	}

}