package Domain;

import java.util.ArrayList;
import java.util.List;

public class Result {

    final List<Cars> results = new ArrayList<>(5);
    public Result(int tryCount, Cars cars) {
        reportResults(tryCount, cars);

    }

    public void reportResults(int tryCount, Cars cars) {
        for (int i = 0; i < tryCount; i++) {
            cars.reportOneResult();
            results.add(cars);
        }
    }
}
