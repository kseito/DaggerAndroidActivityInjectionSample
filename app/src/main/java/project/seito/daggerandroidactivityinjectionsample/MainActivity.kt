package project.seito.daggerandroidactivityinjectionsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import dagger.android.AndroidInjection
import javax.inject.Inject



class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var injectionClassA: InjectionClassA

    @Inject
    lateinit var injectionClassB: InjectionClassB

    public val prefix = "Android"

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        textView.setText("${injectionClassA.getHello()} ${injectionClassB.getDagger()} !")
    }
}
