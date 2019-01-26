package project.seito.daggerandroidactivityinjectionsample

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivitySubcomponent::class])
interface ActivityModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    fun bindMainActivity(builder: MainActivitySubcomponent.Builder): AndroidInjector.Factory<*>
}