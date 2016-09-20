
import scala.util._
import scala.tools.nsc.io._
import java.text._
import java.util.Date

val enrolled = io.Source.fromFile("participants.conf").getLines.toList

val excluded = args
val participants = enrolled.diff(excluded)

println(s"Session presenter is: ${participants(Random.nextInt(participants.size))}")

if(!excluded.isEmpty){

	val fileName = new SimpleDateFormat("dd.MM.yyyy").format(new Date)
	
	File(s"archive/${fileName}_excluded.txt").writeAll(excluded.map(x => x + sys.props("line.separator")):_*)
}
