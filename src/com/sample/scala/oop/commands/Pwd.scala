package com.sample.scala.oop.commands
import com.sample.scala.oop.filesystem.State

class Pwd extends Command {
  override def apply(state: State): State =
    state.setMessage(state.wd.path)
}
