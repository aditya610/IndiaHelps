package com.example.android.helpindia.`class`

import java.util.*
import kotlin.collections.ArrayList


data class Ngo(
        val name:String,
        val type:String,
        val cause: String,
        val city:String

)





val ngoname= arrayOf("Make a difference","Help india","Mahatma gandhi charity","old age home")
val ngotype = arrayOf("old age people","young age people","all age")
val ngocause= arrayOf("help young people to develop a future","help old people","help every one")
val ngocity= arrayOf("delhi","haryana","punjab","chennai","jaipur")

fun generaterandomngo():ArrayList<Ngo>
{ val ngo=ArrayList<Ngo>()
    var r=Random()
for(i in 1..10)
{
    ngo.add(Ngo(ngoname[r.nextInt(3)],"type: "+ngotype[r.nextInt(2)], "cause:"+ngocause[r.nextInt(1)],"city:"+ ngocity[r.nextInt(3)]))
}
return ngo
}



