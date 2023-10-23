package search

class BinarySearch {
    fun binarySearch(arr: IntArray, high: Int, low: Int, number: Int): Int {

        // check base case
        if(high >= low) {
            var mid = (high + low)/2

            if (arr[mid] == number) {
                return mid
            }
            if(arr[mid] > number) {
                binarySearch(arr, mid - 1, low, number)
            } else {
                binarySearch(arr, high, mid + 1, number)
            }
        } else {
            return -1
        }
        return -1
    }
}