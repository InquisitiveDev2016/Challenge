public class LinearSearch {

    public int LinearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) {
                return array[i];
            }
        }
        return -1;

    }
}
