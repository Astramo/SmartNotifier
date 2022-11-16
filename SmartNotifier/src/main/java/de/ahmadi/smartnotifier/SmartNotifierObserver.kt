package de.ahmadi.smartnotifier

interface SmartNotifierObserver {
    fun onReceivedDate(data:Any?)
    fun getKey() : SmartNotifierModel
}