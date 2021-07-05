package com.vaca.jsonarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.blankj.utilcode.util.SPUtils
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val fuck=JSONArray()
//        fuck.put("")
//        fuck.put("fuck")
//        fuck.put("jiji")
//        val dd=fuck.toString()
//        Log.e("fafa",dd)
//        SPUtils.getInstance().put("fuck",dd)
        val gg=SPUtils.getInstance().getString("fuck")
        val dd=JSONArray(gg)
        Log.e("len",dd.length().toString())
        for(k in 0 until dd.length()){
            Log.e("asdlkfj","a"+dd[k].toString()+"b")
        }
    }
}