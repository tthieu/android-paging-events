package com.example.paging.events.db

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging.events.model.Address

@Entity(tableName = "event")
data class DatabaseEvent constructor(
    @PrimaryKey val id: String,
    val infoUrl: String?,
    val descShort: String?,
    val descFull: String?,
    val startingDay: String?,
    val endingDay: String?,
    val addLocality: String?,
    val addPostalCode: String?,
    val addStreetAddress: String?,
    val lat: Double?,
    val lon: Double?,
    // val urlImg: String?,
    val nameEn: String?,
    val nameFi: String?,
    val nameSv: String?,
    val nameZh: String?,
)

