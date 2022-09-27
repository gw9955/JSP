package work;

import java.util.Comparator;

public class SumDesc implements Comparator<Student> {
	@Override
	public int compare(Student stl1, Student stl2) {
		if (stl1.getSum() > stl2.getSum()) {
			return -1;
		} else if (stl1.getSum() == stl2.getSum()) {
			return new Integer(stl1.getNum().compareTo(stl2.getNum())) * -1;
		} else {
			return 1;
		}
	}

}
