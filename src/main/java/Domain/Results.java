package Domain;

import java.util.ArrayList;
import java.util.List;

public class Results {
    final List<Result> results = new ArrayList<>();

    public Results(int tryCount, Cars cars) {
        reportResults(tryCount, cars);
    }

    public void reportResults(int tryCount, Cars cars) {
        for (int i = 0; i < tryCount; i++) {
            results.add(new Result(cars));
        }
    }

    public List<Result> getResults() {
        return results;
    }
}
