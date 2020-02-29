/*
    Daniel Zavalza Valentín   A01365099
    Problem 23  --  Extract a given number of randomly selected elements from a list.
    Algorithm of the problems to solve:
        *Give the number of random elements to be selected
        *Create the list
        *Create an arrayList where the selected values will be added
        *until the result arraylist size is equal to the number of elements to be selected stop selecting elements
        *add the selected element to the arrayList
        ** I added that an element cannot be added more than once, so if an element already exists in the arraylist, then it will choose another one.
    Tests:
    Given by the problem:
        3, "abcdefgh"
        possible result: [c, h, f]
    Cases developed by the student:
        5, "osodmkmibimvk"
        possible result: [v,k,s,o,d]
 */
package com.example.act23

//Test given by the problem. the Result will not be the same because elements are selected randomly
val num1 = 3
val list1 = "abcdefgh".toList()
val resList: MutableList<Char> = ArrayList()        //The final ArrayList

while(resList.size < num1){                     //loop until size of resList is equal to given number
    var rnd = list1.random()                    //Get a random element of original List
    if(!resList.contains(rnd)){                 //if selected element is not in the final list then it adds it
        resList.add(rnd)                        //This will give a list with 3 random elements and none will repeat
    }
}

println("\nTest 1 result:\n")
println(resList)

//Test 2
val num2 = 5
val list2 = "osodmkmibimvk".toList()
val resList2: MutableList<Char> = ArrayList()        //The final ArrayList

while(resList2.size < num2){                     //loop until size of resList is equal to given number
    var rnd2 = list2.random()                    //Get a random element of original List
    if(!resList2.contains(rnd2)){                 //if selected element is not in the final list then it adds it
        resList2.add(rnd2)                        //This will give a list with 3 random elements and none will repeat
    }
}

println("\nTest 2 result:\n")
println(resList2)


//Test 3
val num3 = 7
val list3 = "023rjw9dkm9cjs8aofpod23".toList()
val resList3: MutableList<Char> = ArrayList()        //The final ArrayList

while(resList3.size < num3){                     //loop until size of resList is equal to given number
    var rnd3 = list3.random()                    //Get a random element of original List
    if(!resList3.contains(rnd3)){                 //if selected element is not in the final list then it adds it
        resList3.add(rnd3)                        //This will give a list with 3 random elements and none will repeat
    }
}

println("\nTest 3 result:\n")
println(resList3)

