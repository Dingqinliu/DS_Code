public class JZ_offer01 {
    //二维数组中元素的查找

    public boolean Find(int target, int [][] array) {
//        for (int i=0;i<array.length;i++){   //方法一，遍历法查找
//            for (int j=0;j<array[i].length;j++){
//                if (array[i][j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;

        //2、二分查找 因为题目给定的数组每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
        //1）我么设初始值为右上角元素，arr[0][5] = val，目标tar = arr[3][1]
        //2）接下来进行二分操作：
        //3）如果val == target,直接返回
        //4）如果 tar > val, 说明target在更大的位置，val左边的元素显然都是 < val，间接 < tar，说明第 0 行都是无效的，所以val下移到arr[1][5]
        //5）如果 tar < val, 说明target在更小的位置，val下边的元素显然都是 > val，间接 > tar，说明第 5 列都是无效的，所以val左移到arr[0][4]
        //6）继续步骤2）
        // 判断数组是否为空
        int m = array.size();
        if (m == 0) return false;
        int n = array[0].size();
        if (n == 0) return false;
        int r = 0, c = n-1; // 右上角元素
        while (r<m && c>=0) {
            if (target == array[r][c]) {
                return true;
            }
            else if (target > array[r][c]) {
                ++r;
            }
            else {
                --c;
            }
        }
        return false;
    }
}
