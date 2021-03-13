import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("我");
        list.add("爱");
        list.add("编");
        list.add("程");
        System.out.println(list);
//        for (String e:list){
//            System.out.println(e);
//        }

        Iterable<String>r=list;
        Iterator<String>it=r.iterator();
        //以上两句或直接写成：
        //Iterator<String>it=list.iterator();
        while (it.hasNext()){  //获取下一个元素，并让迭代器走到之后的位置上
            String s=it.next();// 比如：第一次循环时，返回“我”，迭代器内部走到了“爱”
            System.out.println(s);
        }
    }
}
