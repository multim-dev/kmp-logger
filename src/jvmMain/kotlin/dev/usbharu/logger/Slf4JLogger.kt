package dev.usbharu.logger

import org.slf4j.LoggerFactory

class Slf4JLogger(tag: String) : Logger(tag) {

    private val logger: org.slf4j.Logger = LoggerFactory.getLogger(tag)

    override fun log(level: Level, tag: String, message: String?, throwable: Throwable?) {
        val nonNullMessage = message ?: "null"
        when (level) {
            Level.TRACE -> {
                if (throwable != null) {
                    logger.trace(nonNullMessage, throwable)
                } else {
                    logger.trace(nonNullMessage)
                }
            }

            Level.DEBUG -> {
                if (throwable != null) {
                    logger.debug(nonNullMessage, throwable)
                } else {
                    logger.debug(nonNullMessage)
                }
            }

            Level.INFO -> {
                if (throwable != null) {
                    logger.info(nonNullMessage, throwable)
                } else {
                    logger.info(nonNullMessage)
                }
            }

            Level.WARN -> {
                if (throwable != null) {
                    logger.warn(nonNullMessage, throwable)
                } else {
                    logger.warn(nonNullMessage)
                }
            }

            Level.ERROR -> {
                if (throwable != null) {
                    logger.error(nonNullMessage, throwable)
                } else {
                    logger.error(nonNullMessage)
                }
            }
        }
    }
}
