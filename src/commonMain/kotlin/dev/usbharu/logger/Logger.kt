package dev.usbharu.logger

import kotlin.jvm.JvmOverloads

expect abstract class Logger{

    @JvmOverloads
    fun error(message: String?, throwable: Throwable? = null)
    @JvmOverloads
    fun warn(message: String?, throwable: Throwable? = null)
    @JvmOverloads
    fun info(message: String?, throwable: Throwable? = null)
    @JvmOverloads
    fun debug(message: String?, throwable: Throwable? = null)
    @JvmOverloads
    fun trace(message: String?, throwable: Throwable? = null)
}
