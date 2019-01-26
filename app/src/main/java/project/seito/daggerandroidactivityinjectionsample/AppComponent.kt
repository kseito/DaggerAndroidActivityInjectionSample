package project.seito.daggerandroidactivityinjectionsample

import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(modules = [AndroidInjectionModule::class, AppModule::class, ActivityModule::class])
interface AppComponent {

    fun inject(app: App)
}