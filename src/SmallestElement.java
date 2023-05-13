public class SmallestElement {
    public static void main(String[] args) {

        int[] array = new int[] {25,15,8,45,39};
        int min = array[0];
        for(int i=0;i<array.length;i++){

            if(array[i]<min)
                min=array[i];
        }
        System.out.println("Largest Element of array  = "+min);
    }
}
