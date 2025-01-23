public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (Integer num : list) {
            if (num % 2 == 0) {
                list.remove(num); // ConcurrentModificationException
            }
        }
        System.out.println(list);
    }
}