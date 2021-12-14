// WITH_STDLIB
// WORKS_WHEN_VALUE_CLASS
// LANGUAGE: +ValueClasses

class Foo {
    var a: Int = 42
    var d by Delegate(0)
}

var setterInvoked = 0

OPTIONAL_JVM_INLINE_ANNOTATION
value class Delegate(val default: Int) {

    operator fun getValue(thisRef: Any?, prop: Any?) =
        (thisRef as? Foo)?.a ?: default

    operator fun setValue(thisRef: Any?, prop: Any?, newValue: Int) {
        setterInvoked++
        if (thisRef is Foo) {
            thisRef.a = newValue
        }
    }
}


fun box(): String {
    val x = Foo()
    if (x.d != 42) throw AssertionError()

    x.d = 1234
    if (x.d != 1234) throw AssertionError()
    if (x.a != 1234) throw AssertionError()

    if (setterInvoked != 1) throw AssertionError()

    return "OK"
}