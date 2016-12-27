@file:JvmName("RobotPlayer")

package alpha

import battlecode.common.Clock
import battlecode.common.Direction
import battlecode.common.RobotController

fun run(controller: RobotController) {
    while (true) {
        try {
            controller.move(Direction.EAST)
            Clock.`yield`()
        } catch (e: Exception) {
            println("I done goofed: " + e.message)
            e.printStackTrace()
        }
    }
}
