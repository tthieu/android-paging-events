package com.example.paging.events.db

import androidx.paging.PagingSource
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.paging.events.model.Event

interface EventDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(event: List<Event>)

    @Query("SELECT * FROM event WHERE " +
    "nameEn LIKE :queryString OR descFull LIKE :queryString OR descShort LIKE :queryString OR addStreetAddress LIKE :queryString " +
    "ORDER BY startingDay ASC, nameEn ASC")
    fun eventByName(queryString: String): PagingSource<Int, Event>

    @Query("DELETE FROM event")
    suspend fun clearEvent()
}