package com.example.a621k

import android.text.Editable

class User {
    var age: Int? = null
    var salary: Double? = null
    var workH: Long? = null
    var dayOff: Boolean? = null
    constructor()

    constructor(age: Int?, salary: Double?, workH: Long?, dayOff: Boolean?) {
        this.age = age
        this.salary = salary
        this.workH = workH
        this.dayOff = dayOff
    }
}