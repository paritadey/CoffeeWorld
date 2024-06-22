package com.tokai.mobile.coffeeworld

import dev.icerock.moko.resources.StringResource

expect class Strings {
    fun get(id:StringResource, args:List<Any>):String
}