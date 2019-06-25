package challenges.makeArrayConsentive;

import java.util.Collections;
import java.util.List;

public class MakeArrayConsentive {
    public int makeArrayConsentive(List<Integer> numbers) {
        return Collections.max(numbers) - Collections.min(numbers) - numbers.size() + 1;
    }
}
