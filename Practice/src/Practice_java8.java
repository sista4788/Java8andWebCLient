import java.util.List;
import java.util.ArrayList;

public class Practice_java8 {

	public static void main(String[] args) {

		List<Integer> cyclenums = new ArrayList<Integer>();

		cyclenums.add(null);
		cyclenums.add(1);
		cyclenums.add(3);
		cyclenums.add(2);
		cyclenums.add(4);
		cyclenums.add(1);
		cyclenums.add(3);
		cyclenums.add(99);
		cyclenums.add(98);
		cyclenums.add(5);
		cyclenums.add(2);

		System.out.println(cyclenums);

		int cpmCount = 0;

		for (int i = 0; i < cyclenums.size(); i++) {
			if (null != cyclenums.get(i) && (cyclenums.get(i) != 98 || cyclenums.get(i) != 99)) {
				System.out.println("current cpmCount --> " + cpmCount);
				cpmCount += 1;
			}
		}
		System.out.println(cpmCount);
	}
}
