import akka.NotUsed
import akka.stream._
import akka.stream.scaladsl._

val source: Source[Int, NotUsed] = Source (1 to 100)

source.runForeach(i => println(i)) (materializer)

