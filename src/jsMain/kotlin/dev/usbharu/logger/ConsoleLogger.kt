package dev.usbharu.logger

class ConsoleLogger(tag: String) : Logger(tag) {
    override fun log(level: Level, tag: String, message: String?, throwable: Throwable?) {
        when (level) {
            Level.TRACE -> {
                console.log("$tag : $message")
                console.log(throwable?.stackTraceToString())
            }

            Level.DEBUG -> {
                console.log("$tag : $message")
                console.log(throwable?.stackTraceToString())
            }

            Level.INFO -> {
                console.info("$tag : $message")
                console.info(throwable?.stackTraceToString())
            }

            Level.WARN -> {
                console.warn("$tag : $message")
                console.warn(throwable?.stackTraceToString())
            }

            Level.ERROR -> {
                console.error("$tag : $message")
                console.error(throwable?.stackTraceToString())
            }
        }
    }
}
