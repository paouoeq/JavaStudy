package mobile;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;
	
	// 생성자
	public Mobile() {	}
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	// 메소드
	public abstract int operate(int tiem);
	public abstract int charge(int tiem);
	
	
	// getter/setter
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s\t %d\t  %s", mobileName, batterySize, osType);
	}
	
	
}
