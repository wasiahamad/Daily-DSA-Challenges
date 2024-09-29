public class RemoveElement {
    public static int removeElement (int arr[], int val) {
        int i = 0; 
        int j = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
            i++;
        }
       return j;

    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(arr, val));
    }
}
