package com.example.calendar

import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

object CalendarBinding {
    @BindingAdapter("nowYear", "nowMonth")
    @JvmStatic
    fun nowYearMonth(textView : TextView, year : Int, month : Int) {
        textView.text = "$year / $month"
    }

    @BindingAdapter("setAdapter")
    @JvmStatic
    fun setAdapter(recyclerView : RecyclerView, list : List<CalendarData>?) {
        list?.let{
            val adapter = CalendarAdapter(list)
            recyclerView.adapter = adapter
        }
    }

    @BindingAdapter("setDayText")
    @JvmStatic
    fun setDayText(textView : TextView, day : Int) {
        textView.text = day.toString()
    }

    @BindingAdapter("isNowMonth")
    @JvmStatic
    fun isNowMonth(textView : TextView, isNowMonth : Boolean) {
        if(!isNowMonth) textView.alpha = 0.3f
    }
}