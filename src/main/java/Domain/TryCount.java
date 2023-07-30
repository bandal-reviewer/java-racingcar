package Domain;

import java.util.Objects;

public class TryCount {
    private static final int MIN_TRY_COUNT_RANGE = 0;
    final int count;

    public TryCount(String count) {
        validateCountFormat(count);
        validateCountRange(count);
        this.count = Integer.parseInt(count);
    }

    private void validateCountFormat(String count) {
        if (!count.matches("[0-9]+"))
            throw new IllegalArgumentException("[Error] 시도할 횟수는 숫자로 작성해야 합니다.");
    }

    private void validateCountRange(String count) {
        if (Integer.parseInt(count) <= MIN_TRY_COUNT_RANGE)
            throw new IllegalArgumentException("[Error] 시도할 횟수는 1회 이상으로 작성해야 합니다.");
    }

    public int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TryCount tryCount = (TryCount) o;
        return count == tryCount.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
