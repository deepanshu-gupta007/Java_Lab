import java.util.*;
class Alternate {
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        Iterator<Integer> i1=list1.iterator(); 
        Iterator<Integer> i2=list2.iterator(); 
        List<Integer> result=new ArrayList<Integer>(); 
        while(i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext())
                result.add(i1.next());
            if (i2.hasNext())
                result.add(i2.next());
        }
        return result;
    }
}
public class AlternateList {
    public static void main(String[] args) {
        List<Integer> L1=new ArrayList<>(); 
        Collections.addAll(L1, 1, 2, 3, 4, 5); 
        List<Integer> L2=new ArrayList<>(); 
        Collections.addAll(L2, 6, 7, 8, 9, 10,11,12); 
        List<Integer> L3=new ArrayList<>(); 
        L3=Alternate.alternate(L1,L2); 
        System.out.println(L1); 
        System.out.println(L2); 
        System.out.println(L3);
    }
}

