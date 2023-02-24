package dev.usbharu.logger

class Slf4JLogger(private val logger: org.slf4j.Logger) : Logger() {

    override fun getLogger(): org.slf4j.Logger {
        return logger
    }
}
