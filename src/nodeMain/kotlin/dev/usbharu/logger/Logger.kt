package dev.usbharu.logger

actual abstract class Logger(private val tag:String) {
    actual fun error(message: String?, throwable: Throwable?) {
        console.error("$tag$message")
        throwable?.printStackTrace()
    }

    actual fun warn(message: String?, throwable: Throwable?) {
        console.warn("$tag$message")
        throwable?.printStackTrace()
    }

    actual fun info(message: String?, throwable: Throwable?) {
        console.info("$tag$message")
        throwable?.printStackTrace()
    }

    actual fun debug(message: String?, throwable: Throwable?) {
        console.log("$tag$message")
        throwable?.printStackTrace()
    }

    actual fun trace(message: String?, throwable: Throwable?) {
        console.log("$tag$message")
        throwable?.printStackTrace()
    }

}
