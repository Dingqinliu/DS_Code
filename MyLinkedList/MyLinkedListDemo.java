package MyLinkedList;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("2");
        System.out.println(list);//{0,1,2,2}

        list.add(3,"3");
        System.out.println(list);//{0,1,2,3,2}

        list.remove(1);
        System.out.println(list);//{0,2,3,2}
        System.out.println(list.contains("1"));//false
        System.out.println(list.indexOf("2"));//1
        System.out.println(list.lastIndexOf("2"));//3
        System.out.println(list.get(1));//2
        list.set(0,"4");
        System.out.println(list);//{4,2,3,2}
        list.remove("2");
        System.out.println(list);//{4,3,2}
        System.out.println(list.isEmpty());//false
        list.clear();
        System.out.println(list);//{}
        System.out.println(list.isEmpty());//true
    }
}
