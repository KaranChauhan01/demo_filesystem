package com.sample.scala.oop.commands
import com.sample.scala.oop.files.DirEntry
import com.sample.scala.oop.filesystem.State

class Ls extends Command {

  def createNiceOutput(contents: List[DirEntry]): String = {
    if(contents.isEmpty) ""
    else {
      val entry = contents.head
      entry.name + "[" + entry.getType + "]" + "\n" + createNiceOutput(contents.tail)
    }
  }

  override def apply(state: State): State = {
    val contents = state.wd.contents
    val niceOutput = createNiceOutput(contents)
    state.setMessage(niceOutput)
  }
}
