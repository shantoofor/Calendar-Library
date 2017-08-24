package com.shantoo.calendar.library.materialcalendarview.listener;

import com.shantoo.calendar.library.materialcalendarview.CalendarDay;
import com.shantoo.calendar.library.materialcalendarview.MaterialCalendarView;

/**
 * The callback used to indicate the user changes the displayed month
 */
public interface OnMonthChangedListener {

    /**
     * Called upon change of the selected day
     *
     * @param widget the view associated with this listener
     * @param date   the month picked, as the first day of the month
     */
    void onMonthChanged(MaterialCalendarView widget, CalendarDay date);
}
