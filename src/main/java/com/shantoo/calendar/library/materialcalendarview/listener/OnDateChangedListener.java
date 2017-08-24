package com.shantoo.calendar.library.materialcalendarview.listener;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.shantoo.calendar.library.materialcalendarview.CalendarDay;
import com.shantoo.calendar.library.materialcalendarview.MaterialCalendarView;

/**
 * The callback used to indicate the user changes the date
 */
public interface OnDateChangedListener {

    /**
     * Called upon change of the selected day
     *
     * @param widget the view associated with this listener
     * @param date   the new date. May be null if selection was cleared
     */
    void onDateChanged(@NonNull MaterialCalendarView widget, @Nullable CalendarDay date);
}
