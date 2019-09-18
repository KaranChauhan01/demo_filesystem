package com.sample.scala.oop.commands
import com.sample.scala.oop.files.{DirEntry, File}
import com.sample.scala.oop.filesystem.State

class Touch(name: String) extends CreateEntry(name) {
  override def createSpecificEntry(state: State): DirEntry =
    File.empty(state.wd.path, name)
}
