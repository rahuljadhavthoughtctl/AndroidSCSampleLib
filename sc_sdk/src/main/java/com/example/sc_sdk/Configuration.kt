package com.example.sc_sdk

data class Configuration(
    val clientId: String,
    val domain: String,
    val contactCentreNumber: String,
    val baseUrl: String,
    val bundleId: String,
    val showPermissionSheet: Boolean,
)