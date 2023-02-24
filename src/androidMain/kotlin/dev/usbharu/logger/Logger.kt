package dev.usbharu.logger

import android.util.Log

actual abstract class Logger(private val tag: String) {
    @JvmOverloads
    actual fun error(message: String?, throwable: Throwable?) {
        Log.e(tag, message, throwable)
    }

    @JvmOverloads
    actual fun warn(message: String?, throwable: Throwable?) {
        Log.w(tag, message, throwable)
    }

    @JvmOverloads
    actual fun info(message: String?, throwable: Throwable?) {
        Log.i(tag, message, throwable)
    }

    @JvmOverloads
    actual fun debug(message: String?, throwable: Throwable?) {
        Log.d(tag, message, throwable)
    }

    @JvmOverloads
    actual fun trace(message: String?, throwable: Throwable?) {
        Log.v(tag, message, throwable)
    }
}