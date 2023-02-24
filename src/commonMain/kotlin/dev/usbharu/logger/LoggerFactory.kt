package dev.usbharu.logger

expect object LoggerFactory {
    fun getLogger(tag:String):Logger
}
