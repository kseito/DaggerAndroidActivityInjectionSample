package project.seito.daggerandroidactivityinjectionsample

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivitySubcomponent: AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>() {

        abstract fun mainActivityModule(module: MainActivityModule): Builder

        override fun seedInstance(instance: MainActivity?) {
            mainActivityModule(MainActivityModule(instance!!.prefix))
        }
    }
}