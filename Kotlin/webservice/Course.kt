package com.coding.oc

data class Course(var identifier:Int,
                  var title:String,
                  var level:Level = Level.ENTRY,
                  var isActive:Boolean = false){
    companion object {
        fun newInstance(identifier: Int,title: String,level: Level,isActive: Boolean)
                = Course(identifier,title,level,isActive)
    }
}