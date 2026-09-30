package com.kinou.gameassist.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A round button that opens the in-game overlay menu (HUD editor, toggles, stop), placed per
 * profile like the virtual buttons. A profile without one uses the pull-out edge handle.
 */
@Serializable
data class MenuButtonConfig(
    @SerialName("x")
    var x: Float = 0.04f, // Normalized 0.0 .. 1.0 (center)

    @SerialName("y")
    var y: Float = 0.15f, // Normalized 0.0 .. 1.0 (center)

    @SerialName("radius")
    var radius: Float = 0.035f // Normalized relative to screen height
)
