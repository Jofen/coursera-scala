package greeter

object test {
  val problem = new Pouring(Vector(4, 9))         //> problem  : greeter.Pouring = greeter.Pouring@6719dc16
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with gr
                                                  //| eeter.test.problem.Move] = Vector(Empty(0), Empty(1), Fill(0), Fill(1), Pour(
                                                  //| 0,1), Pour(1,0))
  
  problem.solutions(6)                            //> res1: Stream[greeter.test.problem.Path] = Stream(Fill(1) Pour(1,0) Empty(0) 
                                                  //| Pour(1,0) Empty(0) Pour(1,0) Fill(1) Pour(1,0)--> Vector(4, 6), ?)
}