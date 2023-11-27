package com.example.kotlinrest.model

import java.time.LocalDateTime

data class PingResponse(val currentDateTime: LocalDateTime, val hostname: String)
