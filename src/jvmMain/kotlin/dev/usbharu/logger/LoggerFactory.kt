package dev.usbharu.logger

import org.slf4j.LoggerFactory as Slf4jLoggerFactory

actual object LoggerFactory {
    actual fun getLogger(tag: String): Logger {
        return Slf4JLogger(Slf4jLoggerFactory.getLogger(tag))
    }
}
