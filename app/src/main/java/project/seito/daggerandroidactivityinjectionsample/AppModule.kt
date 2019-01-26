package project.seito.daggerandroidactivityinjectionsample

import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun getModuleA(): InjectionClassA {
        return InjectionClassA()
    }
}