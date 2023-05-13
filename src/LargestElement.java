public class LargestElement {
    public static void main(String[] args) {

        int[] array = new int[] {25,15,8,45,39};
        int max = array[0];
        for(int i=0;i<array.length;i++){

            if(array[i]>max)
                max=array[i];
        }
        System.out.println("Largest Element of array  = "+max);
    }
}
