public class MaxOfNumbers<T> {

    public static void main(String[] args) {
        Integer obj1 = 76879;
        Integer obj2 = 879779;
        Integer obj3 = 21234;
        Integer max = obj1;

        if (obj2.compareTo(max) > 0) {
            max = obj2;
        } else if (obj3.compareTo(max) > 0) {
            max = obj3;
        }
        System.out.println("Max of three number is: " + max);
    }
}

