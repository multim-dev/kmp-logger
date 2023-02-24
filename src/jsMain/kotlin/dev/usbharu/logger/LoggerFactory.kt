package dev.usbharu.logger

actual object LoggerFactory {
    actual fun getLogger(tag: String): Logger {
        return ConsoleLogger(tag)
    }
}
