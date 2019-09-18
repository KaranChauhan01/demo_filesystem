package com.sample.scala.oop.files

import com.sample.scala.oop.filesystem.FileSystemException

class File(override val parentPath: String, override val name: String, contents: String)
  extends DirEntry(parentPath, name) {
  override def asDirectory: Directory =
    throw new FileSystemException("A file cannot be converted into a directory!")

  override def getType: String = "File"

  override def asFile: File = this
}

object File {
  def empty(parentPath: String, name: String): File =
    new File(parentPath, name, "")
}
