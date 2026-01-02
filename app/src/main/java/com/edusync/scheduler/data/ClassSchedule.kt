package com.edusync.scheduler.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime
import java.time.LocalTime

@Entity(tableName = "class_schedules")
data class ClassSchedule(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val className: String,
    val instructor: String,
    val room: String,
    val dayOfWeek: Int, // 1-7 (Monday-Sunday)
    val startTime: LocalTime,
    val endTime: LocalTime,
    val color: String = "#2196F3", // Material Blue default
    val isActive: Boolean = true,
    val notificationEnabled: Boolean = true,
    val notificationMinutesBefore: Int = 15,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val updatedAt: LocalDateTime = LocalDateTime.now()
)

// Extension functions for easy use
fun ClassSchedule.getFormattedTime(): String {
    return "${startTime.toString()} - ${endTime.toString()}"
}

fun ClassSchedule.getDayName(): String {
    return when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday" 
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Unknown"
    }
}