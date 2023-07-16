package Domain;

public class TryCount {
    final int count;

    public TryCount(String count) {
        validateCountFormat(count);
        validateCountRange(count);
        this.count = Integer.parseInt(count);
    }

    public void validateCountFormat(String count) {
        if (!count.matches("[0-9]+"))
            throw new IllegalArgumentException("[Error] 시도할 횟수는 숫자로 작성해야 합니다.");
    }

    public void validateCountRange(String count) {
        if (Integer.parseInt(count) == 0)
            throw new IllegalArgumentException("[Error] 시도할 횟수는 1회 이상으로 작성해야 합니다.");
    }

//    public int getCount() {
//        return count;
//    }
}
