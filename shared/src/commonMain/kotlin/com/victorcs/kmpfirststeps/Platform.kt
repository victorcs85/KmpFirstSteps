package com.victorcs.kmpfirststeps

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform