
public class CDelivery {
	String name;
	String phone;

	int PriceforDistance(int distance) {
		// System.out.println($10);
		if (distance < 10 && distance > 0) {
			return 10;

		} else if (distance > 10) {
			return 25;
		}
		return 0;
	}

	int PriceForDistanceAndStairs(int distance) {
		if (distance < 10 && distance > 0) {
			return 20;
		} else if (distance > 10) {

			return 35;
		}
		return 0;
	}

	public static void main(String[] args) {
		CDelivery Cobj = new CDelivery();
		System.out.println(Cobj.PriceforDistance(45));

		System.out.println(Cobj.PriceforDistance(9));

		System.out.println(Cobj.PriceforDistance(-20));

		System.out.println(Cobj.PriceForDistanceAndStairs(9));
		System.out.println(Cobj.PriceForDistanceAndStairs(20));

	}

	public Object PriceForWeekEnd() {
		// TODO Auto-generated method stub
		return 50;
	}
}
