public class MaxOfNumbers<T> {

    public static void main(String[] args) {
        Float obj1 = 737.23F;
        Float obj2 = 90.2F;
        Float obj3 = 111.3F;
        Float max = obj1;

        if (obj2.compareTo(max) > 0) {
            max = obj2;
        }
        if (obj3.compareTo(max) > 0) {
            max = obj3;
        }
        System.out.println("Max of three Floating number is: " + max);
    }
}

