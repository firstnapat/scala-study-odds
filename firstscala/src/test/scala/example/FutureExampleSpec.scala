package example

import org.scalatest.freespec.AsyncFreeSpec
import org.scalatest.matchers.should.Matchers

import scala.concurrent.Future

class FutureExampleSpec extends AsyncFreeSpec with Matchers {
  "using with very long computation" in {
    val veryLongComputation = (x: Int) => {
      Thread.sleep(1000)
      x * x
    }

    Future(veryLongComputation(15)) map {
      case 25 => assert(true)
      case _ => assert(true)
    }
    Future(veryLongComputation(2))
      .map(veryLongComputation)
      .map(veryLongComputation)
      .map { _ shouldBe 256}
  }

  "using with sequential executing" in {
    val example = new FutureExample
    Future(example.sequentialExecuting(System.currentTimeMillis()))
      .map { _ shouldBe ()}
  }
  "using with parallel executing" in {
    val example2 = new FutureExample
    Future(example2.parallelExecuting(System.currentTimeMillis()))
      .map { _ shouldBe ()}
  }

  "using with a lot of parallel executing" in {
    val example3 = new FutureExample
    Future(example3.alotOfParallelExecution(System.currentTimeMillis()))
      .map { _ shouldBe ()}
  }


}
