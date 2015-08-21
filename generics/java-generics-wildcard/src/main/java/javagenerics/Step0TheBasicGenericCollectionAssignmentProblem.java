package javagenerics;

import java.util.ArrayList;
import java.util.List;

public class Step0TheBasicGenericCollectionAssignmentProblem {

    public static void main(String[] args) {
        List<A> listA = new ArrayList<A>();
        List<B> listB = new ArrayList<B>();

        /*You cannot do this because you could risk that listA contains non-B objects.*/
//        listA = listB;

        /*You cannot do this. If you could make this assignment, it would be possible to insert A and C instances into the
        List<B> pointed to by listB. You could do that via the listA reference, which is declared to be of List<A>.
        Thus you could insert non-B objects into a list declared to hold B (or B subclass) instances.*/
//        listB = listA;

    }
}
