Share data witout dependencies every where with destination address!

usage : 

init every class that you want receive data and cast [SmartNotifierObserver]
class OfflineModeViewModel constructor() : SmartNotifierObserver {
private val smartNotifier = SmartNotifier.factory()

init{
  smartNotifier.subscribe(this)
}

 override fun onCleared() {
        super.onCleared()
        smartNotifier.removeSubscription(this)
    }



}


for push data with class name

smartNotifier.publish(
                    key = SmartNotifierModel(
                        ChantEventViewModel::class.java.name
                    ), it
                )



how implement :
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.Astramo:SmartNotifier:version'
	}
