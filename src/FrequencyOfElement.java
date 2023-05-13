public class FrequencyOfElement {
    public static void main(String[] args) {

        int[] array = new int[] {1,2,8,3,5,5,1,2};
        int[] freq = new int[array.length];
        int visited = -1;
        for(int i=0;i<array.length;i++){
            int count = 1;
            for (int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    freq[j]=visited;
                }
            }
            if(freq[i]!=visited)
                freq[i]=count;
        }

        System.out.println("Element | Frequency");
        for (int i=0;i< freq.length;i++){
            if(freq[i]!=visited)
                System.out.println(" "+array[i]+" | " +freq[i]);
        }


    }
}
