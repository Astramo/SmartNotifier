package de.ahmadi.smartnotifier


class SmartNotifier {

    private val subscribers = arrayListOf<SmartNotifierObserver>()

    companion object {
        private var smartNotifier: SmartNotifier? = null
        fun factory(): SmartNotifier {
            if (smartNotifier == null) {
                smartNotifier = SmartNotifier()
            }
            return smartNotifier!!
        }
    }


    fun subscribe(subscriber: SmartNotifierObserver) {
        subscribers.add(subscriber)
    }

    fun removeSubscription(subscriber: SmartNotifierObserver) {
        subscribers.remove(subscriber)
    }

    fun publish(key: SmartNotifierModel, data: Any?) {

        subscribers.firstOrNull { it.getKey().key == key.key }?.onReceivedDate(data)
    }
}

