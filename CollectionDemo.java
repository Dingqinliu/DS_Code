import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("我");
        list.add("今天");
        list.add("再");
        list.add("学习");
        System.out.println(list);

        Collection<String>collection=list;
        System.out.println(collection);
        for (String e:collection){
            System.out.println(e);
        }

        collection.add("再");//尾插
        System.out.println(collection);
        collection.add("吗");
        System.out.println(collection);

        collection.remove("再");//从前往后遍历 删掉第一个
        System.out.println(collection);

        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection);
    }

}
