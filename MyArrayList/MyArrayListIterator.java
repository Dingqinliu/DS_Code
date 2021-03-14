package MyArrayList;

public class MyArrayListIterator implements MyIterator{
    private MyArrayList arrayList;
    private int index;  // 记录目前所在的位置

    public MyArrayListIterator(MyArrayList arrayList) {
        this.arrayList = arrayList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arrayList.size();
    }

    @Override
    public Integer next() {
        Integer e = arrayList.get(index);
        index++;
        return e;
    }
}

