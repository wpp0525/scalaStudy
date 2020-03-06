package com.wpp.scalaStudy.chapter12

object MatchTypeDetail {
  def main(args: Array[String]): Unit = {


    val obj = 10
    val result = obj match {
      case a: Int => a
      //case b: Map[String, Int] => "Map集合"     //todo 如果直接写成类型，会匹配失败，
      case _ => "啥也不是"
    }

  }
}
