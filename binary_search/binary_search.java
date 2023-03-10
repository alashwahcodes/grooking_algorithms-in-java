class BinarySearch {
    /*
     * صلي علي النبي
     * 
     * 
     */
    public static void main(String[] args) {

        int list[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("your item is existing at index " + binarySearch(list, 6)); // 5
    }

    public static int binarySearch(int list[], int item) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (list[mid] == item) {
                return mid;
            } else if (list[mid] > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // if item is not existing
        return -1;
    }

}