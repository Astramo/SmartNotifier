<h3>Share data witout dependencies every where with destination address!</h3>

usage : 

<h5>
init every class that you want receive data and cast [SmartNotifierObserver]
</h5>

<code>

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
	
<code>


for push data with class name

<code>

smartNotifier.publish(key = SmartNotifierModel(ChantEventViewModel::class.java.name), data)

</code>





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
