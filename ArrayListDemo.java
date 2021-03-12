import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 定义一个元素类型是 String 的顺序表
        ArrayList<String> list = new ArrayList<>(); // 一开始是一个空的顺序表

//        list.add("我");  // 由于元素类型是 String 类型，所以元素（参数）类型是String
//        list.add("你");
//        list.add("他");
//
//        System.out.println(list);

//        // 合法下标: [0, 0]
//        list.add(0, "我");   // 下标 0 是否合法？
//
//        // 合法下标: [0, 1]
//        list.add(0, "你");
//
//        // 合法下标: [0, 2]
//        list.add(0, "他");
//
//        System.out.println(list);

//        list.add("我");
//        list.add(0, "你");
//        list.add(1, "他");
//        list.add(1, "谁");
//        list.add(0, "不是");
//        list.add(3, "就是");
//
//        System.out.println(list);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println(list);

        //删除
        //list.remove(4);//越界异常
        boolean a = list.remove("A");
        System.out.println(a);
        System.out.println(list);

        boolean b = list.remove("D");
        System.out.println(b);
        System.out.println(list);

        System.out.println(list.get(0));    // A
        System.out.println(list.get(1));    // B
        System.out.println(list);       // A B C D E F

        System.out.println(list.set(0, "我"));   // A
        System.out.println(list.set(1, "你"));   // B
        System.out.println(list);   // 我 你 C D E F


    }
}
