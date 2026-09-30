package com.kinou.gameassist.ui.overlay

import org.junit.Assert.assertEquals
import org.junit.Test

class MenuOriginTest {

    private val screenW = 2400
    private val screenH = 1080
    private val menuW = 630
    private val menuH = 804

    @Test
    fun testMenuOpensAtTheButtonWhenItFits() {
        assertEquals(Pair(100, 150), menuOrigin(100, 150, menuW, menuH, screenW, screenH))
    }

    @Test
    fun testMenuIsShiftedLeftAndUpNearTheBottomRightCorner() {
        assertEquals(
            Pair(screenW - menuW, screenH - menuH),
            menuOrigin(2300, 1000, menuW, menuH, screenW, screenH)
        )
    }

    @Test
    fun testMenuIsKeptOnScreenForAButtonPartlyOffTheTopLeft() {
        assertEquals(Pair(0, 0), menuOrigin(-20, -30, menuW, menuH, screenW, screenH))
    }

    @Test
    fun testMenuTallerThanTheScreenStartsAtTheTop() {
        assertEquals(Pair(100, 0), menuOrigin(100, 200, menuW, 1200, screenW, screenH))
    }
}
