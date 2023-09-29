package leetcode_779

/*//recursion : delegating a task
n!= 1.2.3.4.....(n-1) * n [Recurrence equation]
n!=(n-1)! * n
e.g: 10!=9! * 10
Special case/base condition / Termination condition:
if(n==0){
return 1  because 0!=1
}

Good practice to write termination condition first

Stack: Recursive call use stack last in first out
Problem statement:
Convert the following:
0-> 01
1-> 10
find out kth character of Sn
Size of Sn=2^n-1
If the String represent 0 then  the left half will be expanded version of 0 and right half will be expanded version of 1
And if String represents 1 then vise versa

* */


class kthGrammar {
    fun kthGrammar(n: Int, k: Int): Int {
        // Base case: If n is 1, the first row contains only 0, so return 0.
        if (n == 1) {
            return 0
        }
        // Calculate the midpoint of the previous row.
        val mid = (1 shl (n - 2))

        // If k is less than or equal to mid, it will be the same as the kth symbol
        // in the previous row. Otherwise, it will be the complement of the k-midth symbol
        // in the previous row.
        return if(k<=mid){
            kthGrammar(n - 1, k)
        }else{
            1 - kthGrammar(n - 1, k - mid)
        }

    }
}