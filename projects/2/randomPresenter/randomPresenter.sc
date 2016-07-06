
import scala.util._

val enrolled = io.Source.fromFile("participants.conf").getLines.toList

val participants = enrolled.diff(args)

println(s"Session presenter is: ${participants(Random.nextInt(participants.size))}")