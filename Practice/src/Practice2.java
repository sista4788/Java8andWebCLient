import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Practice2 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		arrayList.add(7);
		BigDecimal age = BigDecimal.ZERO;
		
		for(Integer array : arrayList) {
			age = age.add(BigDecimal.ONE);
			System.out.println("value --->" + new BigDecimal(12.678).setScale(1,RoundingMode.HALF_UP));
			System.out.println(Math.round(12.38));
		}
	}
}
