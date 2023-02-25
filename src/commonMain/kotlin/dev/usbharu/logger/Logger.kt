package dev.usbharu.logger

abstract class Logger(private val tag: String) {
    fun error(message: String?, throwable: Throwable? = null) {
        log(Level.ERROR, tag, message, throwable)
    }

    fun warn(message: String?, throwable: Throwable? = null) {
        log(Level.WARN, tag, message, throwable)
    }

    fun info(message: String?, throwable: Throwable? = null) {
        log(Level.INFO, tag, message, throwable)
    }

    fun debug(message: String?, throwable: Throwable? = null) {
        log(Level.DEBUG, tag, message, throwable)
    }

    fun trace(message: String?, throwable: Throwable? = null) {
        log(Level.TRACE, tag, message, throwable)
    }

    protected abstract fun log(
        level: Level,
        tag: String,
        message: String?,
        throwable: Throwable? = null
    )


    protected enum class Level {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }
}
