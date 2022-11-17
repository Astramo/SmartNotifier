<h1 style="text-align:center"><strong>Share data without dependencies every where with destination address!</strong></h1>

<h2>usage :&nbsp;</h2>

<h2>init every class that you want receive data and implement the [SmartNotifierObserver]<br />
&nbsp;</h2>

<p><br />
&nbsp;&nbsp; &nbsp;</p>

<pre>class OfflineModeViewModel constructor() : SmartNotifierObserver {
        private val smartNotifier = SmartNotifier.factory()

        init{
          smartNotifier.subscribe(this)
        }

        override fun onCleared() {
            super.onCleared()
            smartNotifier.removeSubscription(this)
        }
        override fun onReceivedDate(data: Any?) {
            do something
        }
        
        override fun getKey(): SmartNotifierModel {
                return SmartNotifierModel(this.javaClass.name)
        }

    }

    }</code></pre>

<p><br />
&nbsp;&nbsp; &nbsp;</p>

<h2><br />
for push data with class name</h2>

<pre>
<code>smartNotifier.publish(key = SmartNotifierModel(ChantEventViewModel::class.java.name), data)

</code></pre>

<h2>how implement :</h2>

<pre>
<code>allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }</code></pre>

<h2>&nbsp;</h2>

<h2>in gradle of app module:</h2>

<pre>
<code>
  
  dependencies {
            implementation 'com.github.Astramo:SmartNotifier:version'
    }</code></pre>

<h2><br />
&nbsp;</h2>
