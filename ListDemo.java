import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list);
        List<String>strings=list.subList(1,3);//打印位置[1,3)的元素
        System.out.println(strings);

        List<String>list1=new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        System.out.println(list1);
        String[] string1=list1.toArray(new String[0]);
        System.out.println(Arrays.toString(string1));
        boolean b = list.retainAll(list1);
        System.out.println(b);

//        Object[] objects=list.toArray();
//        System.out.println(Arrays.toString(objects));
    }
}
