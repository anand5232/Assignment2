public class AscendingOrder {
    public static void main(String[] args) {

        int[] array = new int[]{3,7,1,5,2,4,6};
        int temp=0;
        System.out.println("Original Array");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("array in ascending Order");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
