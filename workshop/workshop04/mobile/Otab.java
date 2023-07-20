package mobile;

public class Otab extends Mobile{

	// 생성자
	public Otab() { }

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	
	// 메서드
	@Override
	public int operate(int time) { // 사용을 통해 배터리 감소, 1분 사용시 배터리 12감소, 잔여 배터리 리턴
		setBatterySize(getBatterySize()-time*12);
		return getBatterySize();
	}

	@Override
	public int charge(int time) { // 충전을 통한 배터리 증가, 1분 충전시 배터리 8증가, 잔여 배터리 리턴
		setBatterySize(getBatterySize()+time*8);
		return getBatterySize();
	}

	@Override
	public String toString() {
		return String.format("%s\t %d\t  %s", getMobileName(), getBatterySize(), getOsType());
	}
	
}
