package com.example.game


object Storage {
    var score=0
    var questionNumber=1
    var maxScore=0
    var operator=""
    var result=0
    var a1=1
    var a2=100
    var b1=1
    var b2=10
    var a =-1
    var b =-1


    fun randomNumberA():Int{
        a = (a1 .. a2).random()
        return a
    }

    fun randomNumberB():Int{
        b = (b1 .. b2).random()
        return b
    }

    fun getRandom() :Int {
        return  (result-7 .. result+7).random()
    }


}