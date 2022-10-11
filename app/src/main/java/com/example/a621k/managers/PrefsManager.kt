package com.example.a621k.managers

import android.content.Context
import android.content.SharedPreferences
import com.example.a621k.User
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class PrefsManager(context: Context) {

    private var sharedPreferences: SharedPreferences?


    init {
        sharedPreferences = context.getSharedPreferences(
            "MyPrefs", Context.MODE_PRIVATE)
    }


    companion object {

        private var prefsManager: PrefsManager? = null

        fun getInstance(context: Context): PrefsManager? {
            if (prefsManager == null) {
                prefsManager = PrefsManager(context)
            }
            return prefsManager
        }
    }


    fun saveDate(user: User) {
        val editor = sharedPreferences?.edit()
        val gson = Gson()
        val json = gson.toJson(user)
        editor?.putString("text", json)
        editor?.commit()
    }

}