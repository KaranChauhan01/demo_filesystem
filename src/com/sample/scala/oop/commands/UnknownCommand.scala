package com.sample.scala.oop.commands
import com.sample.scala.oop.filesystem.State

class UnknownCommand extends Command {
  override def apply(state: State): State = state.setMessage("Command Not Found")
}
