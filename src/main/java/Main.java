public class Main {

    public static void main(String[] args) {
        int intNumber = 9 ;             // Number of integer in the set
        int subArraySize = 3;            // Size of the subArray to consider
        int arrQueue[] = {6, 2, 6, 8, 3, 7, 1, 4, 4};            // integer sample

        System.out.println(Collection.queue(intNumber, subArraySize, arrQueue));
    }
}
