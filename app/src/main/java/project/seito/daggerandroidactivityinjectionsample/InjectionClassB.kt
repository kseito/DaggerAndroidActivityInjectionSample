package project.seito.daggerandroidactivityinjectionsample

class InjectionClassB(private val prefix: String) {

    fun getDagger(): String = "${prefix}Dagger"
}