package MyArrayList;

import java.util.Arrays;

public class MyArrayList implements MyList{
    private Integer[] array;
    private int size;
    public MyArrayList(){
        array=new Integer[16];
        size=0;
    }

    //容量控制
    public void ensureCapacity(){
        if (size<array.length){//至少还能放入一个元素
            return;
        }
        //否则进行扩容--类似搬家
        //1 找到一个新房子 大小是原来的两倍(经验值)
        Integer[] newArray=new Integer[array.length*2];
        //2 旧房子中的东西全部搬到新房子中来
        for (int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        //发朋友圈公布新房子的位置，退掉旧房子
        this.array=newArray;//修改了对象中的属性，再操作顺序表就操作newArray指向的对象了
    }

    @Override
    public boolean add(Integer e) {
        ensureCapacity();
        array[size]=e;//尾插放入元素
        size++;
        return true;
    }

    @Override
    public void add(int index, Integer e) {
        ensureCapacity();
        if (index<0||index>size()){ //判断下标合法性
            throw new ArrayIndexOutOfBoundsException("Index:"+index+"Size"+size);//下标不合法
        }
        //进行插入，[index,size)所有元素后移一格 顺序从后往前
        for (int from=size-1;from>=index;from--){
            int to=from+1;
            array[to]=array[from];
            array[index]=e;//元素放入index位置
            size++;//size增加1
        }
    }

    @Override
    public Integer remove(int index) {
        if (index<0||index>size()){ //判断下标合法性
            throw new ArrayIndexOutOfBoundsException("Index:"+index+"Size"+size);//下标不合法
        }
        Integer e=array[index];
        //把[index+1,size)的元素往前移动一格
        for (int from=index+1;from<size;from++){
            int to=from-1;
            array[to]=array[from];
        }
        //把size-1位置置为空
        array[size-1]=null;
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e) {
        int i = indexOf(e);
        if (i < 0) {
            return false;
        }
        remove(i);
        return true;
    }

    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if (index < 0 || index >= size()) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Integer old = array[index];
        array[index] = e;
        return old;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) >= 0;
    }

    @Override
    public int indexOf(Integer e) {
        // 顺序表的有序 —— 元素和元素之间有次序
        // 并不意味着，元素是按照从小到大或者从大到小来排好序的
        // 所以不能用二分查找，只能遍历查找
        for (int i = 0; i < size; i++) {
            if (e.equals(array[i])) {   // 使用的是 equals 进行比较
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        Arrays.fill(array,null);
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(this);
    }

    @Override
    public String toString() {
        Integer[] toShow = Arrays.copyOf(array, size);
        // toShow.length == size
        return Arrays.toString(toShow);
    }
}
