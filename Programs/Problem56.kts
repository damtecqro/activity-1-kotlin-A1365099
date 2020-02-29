/*
    Daniel Zavalza Valentín   A01365099
    Problem 56  --  Symmetric binary trees.
    Tests:
    Given by the problem:
       Node("a", Node("b"), Node("c"))
        result: true
    Cases developed by the student:
       Node("a", Node("b", Node("d"), Node("e")), Node("c"))
        result: false

        Node("a", Node("b", Node("d"), Node("e")), Node("c" , Node("f"), Node("g"))
        result: true
 */

package com.test.Tutorial

class Node<Element>(
    val value: Element,
    var Left: Node<Element>? = null,
    var Right: Node<Element>? = null
)

//test 1
    val one = Node("a")
    val two = Node("b")
    val three = Node("c")

    one.Left = two
    one.Right = three

    if(one.Left != null && one.Right != null){
        println("true")
    }else{
        println("false")
    }

 //test 2
    val one1 = Node("a")
    val two1 = Node("b")
    val three1 = Node("c")
    val four1 = Node("d")
    val five1 = Node("e")

    one1.Left = two1
    one1.Right = three1
    two1.Left = four1
    two1.Right = five1

    var sim = true
    if(one1.Left != null && one1.Right != null){
        if(two1.Left != null && two1.Right != null  && three1.Left != null && three1.Right != null)
        else{
            sim = false
        }
    }else{
        sim = false
    }

    println(sim)


//test 3
val one2 = Node("a")
val two2 = Node("b")
val three2 = Node("c")
val four2 = Node("d")
val five2 = Node("e")
val six2 = Node("f")
val seven2 = Node("g")

one2.Left = two2
one2.Right = three2
two2.Left = four2
two2.Right = five2
three2.Left = six2
three2.Right = seven2

var sim2 = true
if(one2.Left != null && one2.Right != null){
    if(two2.Left != null && two2.Right != null  && three2.Left != null && three2.Right != null)
    else{
        sim2 = false
    }
}else{
    sim2 = false
}

println(sim2)