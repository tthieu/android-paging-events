package com.example.paging.events.api

import com.example.paging.events.db.DatabaseEvent
import com.example.paging.events.model.Event
import com.google.gson.annotations.SerializedName

data class RepoSearchResponse(
    @SerializedName("meta") val meta: Meta,
    @SerializedName("data") val data: List<Event> = emptyList()
)

data class Meta(
    @SerializedName("count") val count: String,
    @SerializedName("next") val next: String = ""
)

/**
 * Convert search results to database objects
 */
fun RepoSearchResponse.asDatabaseModel(): List<DatabaseEvent> {
    return data.map {
        DatabaseEvent(
            id = it.id,
            infoUrl = it.infoUrl,
            descShort = it.description.intro,
            descFull = it.description.body,
            startingDay = it.eventDates.startingDay,
            endingDay = it.eventDates.endingDay,
            addLocality = it.location.address.locality,
            addPostalCode = it.location.address.postalCode,
            addStreetAddress = it.location.address.streetAddress,
            lat = it.location.lat,
            lon = it.location.lon,
            //urlImg: String?,
            nameEn = it.name.en,
            nameFi = it.name.fi,
            nameSv = it.name.sv,
            nameZh = it.name.zh
        )
    }
}

// 