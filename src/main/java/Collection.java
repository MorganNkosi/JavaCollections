import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {

    public static int queue(int NumInteger, int arraySize, int arrQueue[]){

        int [] subArray = new int[arraySize];
        int unique = 1;
        int maxiUnique = 0;

        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < NumInteger; i++) {
            queue.add(arrQueue[i]);             //populate nodes in queue
        }

        for (int k = 0; k < queue.size() - arraySize; k++) {
            for (int i = 0; i < arraySize; i++) {
                subArray[i] = queue.get(k + i);
            }
            for(int j:subArray) {
                if(!numbers.contains(j) && subArray[0] != j){
                    numbers.add(j);
                    unique++;
                }
            }
            if (unique > maxiUnique){
                maxiUnique = unique;
            }
            unique=1;
        }
        return +maxiUnique;
    }
}