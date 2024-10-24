package com.example.demo.controller

import com.example.demo.response.JsendResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class JsendController {

    @GetMapping("/success")
    fun getSuccess(): JsendResponse<String> {
        val data = "This is a success message!"
        return JsendResponse(status = "success", data = data)
    }

    @GetMapping("/fail")
    fun getFail(): JsendResponse<String> {
        val data = "This is a failure message!"
        return JsendResponse(status = "fail", data = data)
    }

    @GetMapping("/error")
    fun getError(): JsendResponse<Any> {
        val message = "Something went wrong!"
        return JsendResponse(status = "error", message = message)
    }
}