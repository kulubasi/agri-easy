package com.example.myapp

class  CourseInfo(val courseId:String,val title:String)

class NoteInfo(var course:CourseInfo,var title: String,var text:String)

/*class Person(val name:String, var weightLbs: Double=true){//let the weught be default value true bif no value is assigned
    fun eatDessert(addedIceCream:Boolean){
        //if added ice cream increase weight by 4 ponds else by 2 ponds
        weightLbs+= if (addedIceCream) 4.0 else 2.0
    }

    fun calcGoalWeightLbs(IbstoLose:Double=10.0):Double{
        return weightLbs-IbstoLose
    }
}

 */