package dev.usbharu.logger

import org.slf4j.LoggerFactory as Slf4jLoggerFactory

actual object LoggerFactory {

    private val cache = mutableMapOf<String, Logger>()

    actual fun getLogger(tag: String): Logger {
        return cache.getOrPut(tag) { Slf4JLogger(Slf4jLoggerFactory.getLogger(tag)) }
    }
}
