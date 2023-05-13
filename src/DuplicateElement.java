public class DuplicateElement {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,2,7,8,8,3};
        System.out.println("Duplicate element in array");
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
