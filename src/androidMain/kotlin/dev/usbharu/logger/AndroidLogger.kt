package dev.usbharu.logger

import android.util.Log

class AndroidLogger(tag: String) : Logger(tag) {
    override fun log(level: Level, tag: String, message: String?, throwable: Throwable?) {
        when (level) {
            Level.TRACE -> Log.v(tag, message, throwable)
            Level.DEBUG -> Log.d(tag, message, throwable)
            Level.INFO -> Log.i(tag, message, throwable)
            Level.WARN -> Log.w(tag, message, throwable)
            Level.ERROR -> Log.e(tag, message, throwable)
        }
    }
}