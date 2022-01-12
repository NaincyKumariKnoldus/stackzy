package com.theapache64.stackzy.data.remote

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Result(
    @Json(name = "app_name")
    val appName: String,
    @Json(name = "app_libs")
    val appLibs: String?,
    @Json(name = "transitive_libs")
    val transitiveLibs: String?,
    @Json(name = "package_name")
    val packageName: String, // comma-sep
    @Json(name = "version_code")
    val versionCode: Int,
    @Json(name = "version_name")
    val versionName: String,
    @Json(name = "platform")
    val platform: String,
    @Json(name = "apk_size_in_mb")
    val apkSizeInMb: Float,
    @Json(name = "permissions")
    val permissions: String?, // comma-sep
    @Json(name = "gradle_info_json")
    val gradleInfoJson: String,
    @Json(name = "stackzy_lib_version")
    val stackzyLibVersion: Int,
    @Json(name = "logo_image_url")
    val logoImageUrl: String
)