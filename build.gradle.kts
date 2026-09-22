// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // AGP 9 já traz o Kotlin embutido; declarar o KGP aqui (sem aplicar)
    // apenas fixa a versão do Kotlin usada pelo AGP, pelo Compose e pelo KSP.
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ksp) apply false
}
