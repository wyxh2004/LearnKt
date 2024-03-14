val x: String = y as String
//该函数的功能是将变量y强制转换为String类型，并将其赋值给变量x。如果y不是String类型，则会抛出ClassCastException异常。
val x:String? = y as? String
//该函数将变量y强制转换为String类型，并赋值给x。如果y不是String类型，则x的值为null。