package MyArrayList;

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyList list = new MyArrayList();
        System.out.println(list);   // []
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        MyIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer e = iterator.next();
            System.out.println(e);
        }
        System.out.println(list);
        list.add(0, 100);
        list.add(0, 200);
        list.add(0, 300);
        System.out.println(list);

        Integer remove = list.remove(2);
        System.out.println(list);
        System.out.println(remove);

        boolean r = list.remove((Integer)1);    // 通过类型转换，确认调用的是 remove(Integer) 而不是 remove(int)
        System.out.println(r);
        System.out.println(list);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
    }
}
