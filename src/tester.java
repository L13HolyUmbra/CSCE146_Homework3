public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Angle myAngle = new Angle();

		myAngle.setInitialDeg(180.0);

		System.out.println(myAngle.Sin() + " " + myAngle.MySin(10) + " " + Math.abs(myAngle.Sin() - myAngle.MySin(10)));

		System.out.println(myAngle.Cos() + " " + myAngle.MyCos(10) + " " + Math.abs(myAngle.Cos() - myAngle.MyCos(10)));
	}

}