package com.example.paging.events.model

import java.lang.Exception

/**
 * EventSearchResult from a search, which contains List<Event> holding query data,
 * and a String of network error state.
 */
sealed class EventSearchResult {
    data class Success(val data: List<Event>) : EventSearchResult()
    data class Error(val error: Exception) : EventSearchResult()
}
