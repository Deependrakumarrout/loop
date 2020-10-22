package Loop;
import java.util.ArrayList;
public class E_For_Each {

    // This program will show us the highest mark in the arrayList.
    public static void main(String[] args) {
        ArrayList<Integer> studentMarks = new ArrayList<Integer>();
        studentMarks.add(43);
        studentMarks.add(67);
        studentMarks.add(23);
        studentMarks.add(45);

        int total = 0;
        for(int marks : studentMarks) {
            if(marks>total) {
                total = marks;
            }
        }
        System.out.println(total);

    System.out.println(studentMarks.size());
    }
}
