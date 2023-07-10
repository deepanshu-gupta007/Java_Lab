import java.util.ArrayList;
class ArrayListData {
    public static void removeEvenLength(ArrayList<String> array) {
        for (int i=0; i<array.size(); i++) { 
            String word=array.get(i);
            if (word.length()%2==0)
                array.remove(i--);
        }
    }
}
public class RemoveList {
    public static void main(String[] args) {
        ArrayList<String> arrlist=new ArrayList<String>(5); 
        arrlist.add("C++"); 
        arrlist.add("DataScience"); 
        arrlist.add("Python"); 
        arrlist.add("Cyber");
        System.out.println("-----Array List Item-----");
        for (String str: arrlist)
            System.out.println(str);
        ArrayListData.removeEvenLength(arrlist); 
        System.out.println("-----Resultant Array List Item-----");
        for (String str: arrlist)
            System.out.println(str);
    }
}
