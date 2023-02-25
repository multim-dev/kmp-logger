package dev.usbharu.logger

actual object LoggerFactory {

    private val cache = mutableMapOf<String, Logger>()
    actual fun getLogger(tag: String): Logger {
        return cache.getOrPut(tag) { Slf4JLogger(tag) }
    }
}
