public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] array = new int[] {1,2,5,6,3,2};
        int temp=0;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){

                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;

                }

            }

        }
        System.out.println("Second Largest Number in array = "+array[array.length-2]);


    }
}
