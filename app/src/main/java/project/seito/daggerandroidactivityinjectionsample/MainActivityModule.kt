package project.seito.daggerandroidactivityinjectionsample

import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(private val prefix: String) {

    @Provides
    fun provideInjectionClassB() = InjectionClassB(prefix)
}