package base;

public class Sort {

    public int[] bubbleSort(int[] ar){
        for (int i = 0;i<ar.length;i++){
            for (int x = i;x<ar.length;x++){
                if (ar[i]<ar[x]){
                    int temp = ar[x];
                    ar[x] = ar[i];
                    ar[i] = temp;
                }
            }
        }
        return ar;
    }

    public int[] bubbleSortPro(int[] ar){
        for (int i = 0;i<ar.length;i++){
            //进行有序标记
            boolean isSorted = true;
            for (int x = i;x<ar.length;x++){
                if (ar[i]<ar[x]){
                    int temp = ar[x];
                    ar[x] = ar[i];
                    ar[i] = temp;
                    //因为有元素交换，所以是无序的
                    isSorted =false;
                }
            }

            if (isSorted){
                //有序则结束循环
                break;
            }
        }
        return ar;
    }
}
