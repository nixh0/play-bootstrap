package views.html.b5

package object fc {
  /**
   * Returns it as a B5FieldConstructor to use it as default within a template
   */
  implicit val verticalFieldConstructor: B5FieldConstructor = my.vertical.fieldConstructor
}