package example

import cats.effect._
import cats.implicits._

object Hello extends IOApp {
  val greeting = "hello"
  
  override def run(args: List[String]): IO[ExitCode] = {
    IO(println(greeting)).as(ExitCode.Success)
  }
}
