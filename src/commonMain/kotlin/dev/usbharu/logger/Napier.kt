package dev.usbharu.logger

object Napier {
    fun base(antilog: Any) {

    }

    fun isEnable(priority: LogLevel, tag: String?) = true

    private fun log(tag: String?): Logger {
        return LoggerFactory.getLogger(tag ?: "null")
    }

    fun v(message: String, throwable: Throwable? = null, tag: String? = null) {
        log(tag).trace(message, throwable)
    }

    fun v(throwable: Throwable? = null, tag: String? = null, message: () -> String) {
        log(tag).trace(message(), throwable)
    }

    fun i(message: String, throwable: Throwable? = null, tag: String? = null) {
        log(tag).info(message, throwable)
    }

    fun i(throwable: Throwable? = null, tag: String? = null, message: () -> String) {
        log(tag).info(message(), throwable)
    }

    fun d(message: String, throwable: Throwable? = null, tag: String? = null) {
        log(tag).debug(message, throwable)
    }

    fun d(throwable: Throwable? = null, tag: String? = null, message: () -> String) {
        log(tag).debug(message(), throwable)
    }

    fun w(message: String? = null, throwable: Throwable? = null, tag: String? = null) {
        log(tag).warn(message, throwable)
    }

    fun w(throwable: Throwable? = null, tag: String? = null, message: () -> String) {
        log(tag).warn(message(), throwable)
    }

    fun e(message: String? = null, throwable: Throwable? = null, tag: String? = null) {
        log(tag).error(message, throwable)
    }

    fun e(throwable: Throwable? = null, tag: String? = null, message: () -> String) {
        log(tag).error(message(), throwable)
    }

    fun wtf(message: String? = null, throwable: Throwable? = null, tag: String? = null) {
        log(tag).error(message, throwable)
    }

    fun wtf(throwable: Throwable? = null, tag: String? = null, message: () -> String) {
        log(tag).error(message(), throwable)
    }

    fun log(
        priority: LogLevel,
        tag: String? = null,
        throwable: Throwable? = null,
        message: String
    ) {
        when (priority) {
            LogLevel.VERBOSE -> log(tag).trace(message, throwable)
            LogLevel.DEBUG -> log(tag).debug(message, throwable)
            LogLevel.INFO -> log(tag).info(message, throwable)
            LogLevel.WARNING -> log(tag).warn(message, throwable)
            LogLevel.ERROR -> log(tag).error(message, throwable)
            LogLevel.ASSERT -> log(tag).error(message, throwable)
        }
    }

    fun takeLogarithm(antilog: Any) {
    }

    fun takeLogarithm() {

    }
}

enum class LogLevel {
    VERBOSE,
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    ASSERT
}

fun log(
    priority: LogLevel = LogLevel.DEBUG,
    throwable: Throwable? = null,
    tag: String? = null,
    message: () -> String
) {
    Napier.log(priority, tag, throwable, message())
}
