import java.util.HashSet;

public class FirstRecurring {
	Integer firstRecurringCharacter(int[] array) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int element : array) {
			if (hashSet.contains(element))
				return element;
			else
				hashSet.add(element);
		}
		return null;
	}
}
