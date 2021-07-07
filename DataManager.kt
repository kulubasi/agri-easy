package com.example.myapp

class DataManager {
    val courses= HashMap<String,CourseInfo>() // collection that makes iit easy for us to look uop courses by their course id
    //HashMap<type that will be used to lookup, type that will be stored>()
    val notes = ArrayList<NoteInfo>() // is a collection that provides index based acess to its members

    init {
        initializeCourses() //populates our collection of courses or runs automatically
    }

    private fun initializeCourses(){
        var course = CourseInfo("android intents","Android programming with Intents")
        courses.set(course.courseId,course)

        course=CourseInfo("android sync","android sync programming and services")
        courses.set(course.courseId,course)

        course= CourseInfo(title = "Java fundamentals : The Java Language",courseId = "java lang")
        courses.set(course.courseId,course)
    }
}