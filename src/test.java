
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Angle myAngle = new Angle(-450);
		double Ang = myAngle.MySin(100); 
		System.out.println(Ang);

		System.out.println(Math.abs(myAngle.Sin() - myAngle.MySin(100)));

		//System.out.println(myAngle.Cos() + "" + myAngle.MyCos(100) + "" + Math.abs(myAngle.Cos() - myAngle.MyCos(100)));
	}

}
