public class p_1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
//        if (arr.length<3){
//            return false;
//        }
//        for(int i=1;i<arr.length-1;i++){
//            if (arr[i]%2==1 && arr[i-1]%2==1 && arr[i+1]%2==1){
//                return true;
//            }
//        }
//        return false;
//    }
        int count=0;
        for (int i:arr){
            if ((i & 0x1)==1){
                count++;
            }
            else {
                count=0;
            }
            if (count==3){
                return true;
            }
        }
        return false;
    }
}
