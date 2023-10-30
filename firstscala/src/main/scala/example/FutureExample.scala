package example
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits._
import scala.concurrent.Future


class FutureExample {
  val delayedComputation = (computation:Int => Int, fakeDelayValue: Int)=>(x: Int) => {
    Thread.sleep(fakeDelayValue)
    computation(x)
  }

  val power = (x: Int) => x * x

  def getDuration(startTime: Long): Long =
    System.currentTimeMillis() - startTime

  def sequentialExecuting(startTime: Long): Unit = {
    val result = delayedComputation(power, 1000)(5)
    println(s"result from very long computation is $result (${getDuration(startTime)} ms)")
    val result2 = delayedComputation(power, 2000)(7)
    println(s"result from very long computation is $result2 (${getDuration(startTime)} ms)")
  }

  def parallelExecuting(startTime: Long): Unit = {
    val result1 = Future(delayedComputation(power, 2000)(5))
    val result2 = Future(delayedComputation(power, 1000)(7))

    result1.onComplete {
      case Success(x) => println(s"result1 = $x (${getDuration(startTime)} ms")
      case Failure(ex) => println(s"result1 failed by = $ex (${getDuration(startTime)} ms")
    }

    result2.onComplete {
      case Success(x) => println(s"result2 = $x (${getDuration(startTime)} ms")
      case Failure(ex) => println(s"result2 failed by = $ex (${getDuration(startTime)} ms")
    }
    Thread.sleep(5000)
  }
  def alotOfParallelExecution(startTime: Long): Unit = {
  val futureFn = (x: Int) => Future(delayedComputation(power, 500)(x))
  val futureResult: List[Future[Int]] = (1 to 10).map(futureFn).toList
  Future.sequence(futureResult)
    .map(_.sum)
    .foreach(total=> {
      println(s"Total summary result of power 1 to 10 is $total (${getDuration(startTime)}ms)")
    })

  Thread.sleep(5000)
  }
}

  def dependenciesBetweenFutures(startTime: Long): Unit = {
    val result: Future[Int] = for {
      result1 <- Future(delayedComputation(power, 1000)(5))
      result2 <- Future(delayedComputation(power, 1000)(10))
      result3 <- Future(delayedComputation(power, 1000)(result1 + result2))
    } yield result1 + result2 + result3

result.onComplete {
  case Success(x) => println(s"result= $x(${getDuration(startTime)} ms)")
  case Failure(ex) => println(s"result failed by $ex {${getDuration(startTime)} ms)")
  }
  }

def

