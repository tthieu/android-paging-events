package com.example.paging.events.model

import com.google.gson.annotations.SerializedName

data class Event(
    @field:SerializedName("description") val description: Description,
    @field:SerializedName("event_dates") val eventDates: EventDates,
    @field:SerializedName("id") val id: String,
    @field:SerializedName("info_url") val infoUrl: String?,
    @field:SerializedName("location") val location: Location,
    @field:SerializedName("modified_at") val modifiedAt: String?,
    @field:SerializedName("name") val name: Name,
    @field:SerializedName("source_type") val sourceType: SourceType?,
    @field:SerializedName("tags") val tags: List<Tag>
)

data class Description(
    @field:SerializedName("body") val body: String?,
    @field:SerializedName("images") val images: List<Image>,
    @field:SerializedName("intro") val intro: String?
)

data class EventDates(
    @field:SerializedName("additional_description") val additionalDescription: AdditionalDescription?,
    @field:SerializedName("ending_day") val endingDay: String?,
    @field:SerializedName("starting_day") val startingDay: String?
)

data class Location(
    @field:SerializedName("address") val address: Address,
    @field:SerializedName("lat") val lat: Double?,
    @field:SerializedName("lon") val lon: Double?
)

data class Name(
    @field:SerializedName("en") val en: String?,
    @field:SerializedName("fi") val fi: String?,
    @field:SerializedName("sv") val sv: String?,
    @field:SerializedName("zh") val zh: String?
)

data class SourceType(
    @field:SerializedName("id") val id: Int = 0,
    @field:SerializedName("name") val name: String?
)

data class Tag(
    @field:SerializedName("id") val id: String?,
    @field:SerializedName("name") val name: String?
)

data class Address(
    @field:SerializedName("locality") val locality: String?,
    @field:SerializedName("postal_code") val postalCode: String?,
    @field:SerializedName("street_address") val streetAddress: String?
)

data class AdditionalDescription(
    @field:SerializedName("lang_code") val langCode: String?,
    @field:SerializedName("text") val text: String?
)

data class Image(
    @field:SerializedName("copyright_holder") val copyrightHolder: String?,
    @field:SerializedName("license_type") val licenseType: LicenseType,
    @field:SerializedName("url") val url: String?
)

data class LicenseType(
    @field:SerializedName("id") val id: Int = 0,
    @field:SerializedName("name") val name: String?
)