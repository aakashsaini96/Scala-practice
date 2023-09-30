/*
Write a script that will calculate how far a projectile will go given a launch speed and an
angle ignoring friction. Assume that the projectile is launched from ground level with a certain
 speed in m/s and at a certain angle in radians. Use the fact that acceleration due to gravity
  is 9.8m/s2
. The steps in doing this would be to calculate the speed parallel and perpendicular to the
ground with math.sin and math.cos, then figure out how long it takes for the projectile to slow
to a vertical speed of zero (v = v0 − at) and use double that time as how long it stays in the
air.
 */

import io.StdIn._

println("Enter speed in m/s:")
val launchSpeed = readDouble()
println("Enter angle in degrees:")
val angle = math.toRadians(readDouble())

val horiSpeed = launchSpeed * math.cos(angle)
val verSpeed = launchSpeed * math.sin(angle)
val timeInAir = 2 * verSpeed / 9.8
val horiDistCovered = horiSpeed * timeInAir

println(s"The projectile covered a total horizontal distance of $horiDistCovered meters")