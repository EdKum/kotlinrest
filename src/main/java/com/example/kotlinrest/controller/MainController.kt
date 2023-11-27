package com.example.kotlinrest.controller

import com.example.kotlinrest.model.PingResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress
import java.net.UnknownHostException
import java.time.LocalDateTime

@RestController()
class MainController {

    @GetMapping("/ping")
    fun ping(): PingResponse {
       return PingResponse(LocalDateTime.now(), getHostName())
    }

    private fun getHostName(): String {
        return try {
            val localHost = InetAddress.getLocalHost()
            localHost.hostName
        } catch (e: UnknownHostException) {
            "n.A."
        }
    }
}