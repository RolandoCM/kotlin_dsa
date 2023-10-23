package search

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun testBinarySearch() {
        val arr = intArrayOf(10, 29, 100, 102, 203, 299, 300, 332)
        val binarySearch = BinarySearch()
        val result = binarySearch.binarySearch(arr, arr.size-1, 0, 102)
        println(" Number found in the position $result")
        assertEquals(3, result)
    }
}