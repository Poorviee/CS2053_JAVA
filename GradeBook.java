import java.util.ArrayList;
import java.util.Iterator;

public class GradeBook {
    public static void main(String[] args) {

        ArrayList<Integer> marksList = new ArrayList<>();

        marksList.add(85);
        marksList.add(90);
        marksList.add(78);
        marksList.add(92);

        System.out.println(" Initial Student Marks: " + marksList);

        System.out.println("\n Reading marks using Iterator:");
        Iterator<Integer> iterator = marksList.iterator();
        while (iterator.hasNext()) {
            Integer mark = iterator.next();
            System.out.println("Mark: " + mark);
        }

        marksList.set(2, 80);
        System.out.println("\n After Updating (78 → 80): " + marksList);

        marksList.remove(Integer.valueOf(90));
        System.out.println("\n After Removing 90: " + marksList);

        System.out.println("\n Final Marks List using Iterator:");
        Iterator<Integer> finalIterator = marksList.iterator();
        while (finalIterator.hasNext()) {
            System.out.println("Mark: " + finalIterator.next());
        }
    }
}