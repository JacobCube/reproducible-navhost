package org.example.project

import kotlinx.serialization.Serializable

@Serializable
sealed class NavigationNode {

    val route
        get() = this::class.qualifiedName

    abstract val deepLink: String?

    @Serializable
    data object Login: NavigationNode() {
        override val deepLink: String = "/login"
    }

    @Serializable
    data object Home: NavigationNode() {
        override val deepLink: String = "/"
    }
}