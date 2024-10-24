package com.example.demo.response

data class JsendResponse<T>(
    val status: String,
    val data: T? = null,
    val message: String? = null
)