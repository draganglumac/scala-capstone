
package object observatory {

  def homeFile(relativePath: String): java.io.File = new java.io.File(s"${sys.env("HOME")}/$relativePath")

}