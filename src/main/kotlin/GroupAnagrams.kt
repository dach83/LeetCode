/**
 * Problem description on [LeetCode](https://leetcode.com/problems/group-anagrams/)
 */
class GroupAnagrams {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = mutableMapOf<String, MutableList<String>>()

        for (str in strs) {
            val sortedStr = str.toCharArray().sorted().toString()
            groups.compute(sortedStr) { _, value ->
                val list = value ?: mutableListOf()
                list.add(str)
                list
            }
        }

        return groups.values.toList()
    }
}
