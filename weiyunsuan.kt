val x = (1 shl 2) and 0x000FF000 //shl 2表示将1的二进制表示向左移动2位，然后and操作符将结果与0x000FF000进行位与运算，最终得到的结果是0x000F0000
//shl 是 shift left 的缩写，即向左移动
val y = 0x000F0000 shr 12
//shr 是 shift right 的缩写，即向右移动
val z = 0x000F0000 ushr 12
//ushr 是 unsigned shift right 的缩写，即无符号右移
val a = 0x000F0000.inv()
//inv 是 invert 的缩写，即取反
val b = 0x000F0000.inv() and -0x1000000
//and 是 and 的缩写，即与
val c = 0x000F0000.inv() or -0x1000000
//or 是 or 的缩写，即或
val d = 0x000F0000.inv() xor -0x1000000
//xor 是 exclusive or 的缩写，即异或
