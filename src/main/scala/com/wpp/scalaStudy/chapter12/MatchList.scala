package com.wpp.scalaStudy.chapter12

object MatchList {
  def main(args: Array[String]): Unit = {

    for (list <- Array(List(0), List(1, 0), List(12, 13), List(88), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //
        case x :: y :: Nil => x + " " + y //批量含有两个元素的信息的情况
        case 0 :: tail => "0 ..." //
        case x :: Nil => x
        case _ => "something else"
      }
      //1. 0
      //2. 1 0
      //3. 0 ...
      //4. something else
      println(result)
    }

  }
}
