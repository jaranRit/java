package test01;

import javax.swing.JOptionPane;

abstract class Mycehicle implements vehicle2{

	public static void main(String[] args) {
		
		fuel a = new fuel() {
			float calFuel(float rate, float distance) {
				// TODO Auto-generated method stub
				return rate * distance;
			}
		};
		
		Distance b = new Distance();
		
		float rate, distance  , newMile, curMile, cal;
		String r;
		
		r = JOptionPane.showInputDialog("ตราการใช้เชื้อเพลิง  rate");
		rate = Float.parseFloat(r);
		
		r = JOptionPane.showInputDialog("เลขไมล์ระยะทางปัจจุบัน");
		curMile = Float.parseFloat(r);
		
		r = JOptionPane.showInputDialog("เลขไมล์ระยะทางใหม่");
		newMile = Float.parseFloat(r);
		
		distance = b.calDistance(curMile, newMile);
		cal = a.calFuel(rate, distance);
		
		JOptionPane.showMessageDialog(null, "ระยะทางที่ใช้    "+distance+"\nการใช้เชื้อเพลิง    "+cal);
	}

}

abstract class fuel extends vehicle1{
	
	abstract float calFuel(float rate, float distance) ;
}

class Distance implements vehicle2{

	public float calDistance(float curMile, float newMile) {
		
		return newMile - curMile;
	}
	
}
