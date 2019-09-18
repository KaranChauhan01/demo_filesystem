package com.sample.scala.oop.filesystem

import java.util.Scanner

import com.sample.scala.oop.commands.Command
import com.sample.scala.oop.files.Directory

object FileSystem extends App {

  val root = Directory.ROOT
  var state = State(root, root)
  val scanner = new Scanner(System.in)

  while(true) {
    state.show
    val input = scanner.nextLine()
    state = Command.from(input).apply(state)
  }
}
