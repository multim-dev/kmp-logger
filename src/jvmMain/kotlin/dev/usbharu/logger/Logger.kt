package dev.usbharu.logger

import org.slf4j.Logger

actual abstract class Logger {

    abstract fun getLogger():Logger

    @JvmOverloads
    actual fun error(message: String?, throwable: Throwable?) {
        if (throwable != null) {
            getLogger().error(message?:"null",throwable)
        }else {
            getLogger().error(message?:"null")
        }
    }

    @JvmOverloads
    actual fun warn(message: String?, throwable: Throwable?) {
        if (throwable != null) {
            getLogger().warn(message?:"null",throwable)
        }else {
            getLogger().warn(message?:"null")
        }
    }
    @JvmOverloads
    actual fun info(message: String?, throwable: Throwable?) {
        if (throwable != null) {
            getLogger().info(message?:"null",throwable)
        }else {
            getLogger().info(message?:"null")
        }
    }
    @JvmOverloads
    actual fun debug(message: String?, throwable: Throwable?) {
        if (throwable != null) {
            getLogger().debug(message?:"null",throwable)
        }else {
            getLogger().debug(message?:"null")
        }
    }
    @JvmOverloads
    actual fun trace(message: String?, throwable: Throwable?) {
        if (throwable != null) {
            getLogger().trace(message?:"null",throwable)
        }else {
            getLogger().trace(message?:"null")
        }
    }

}
