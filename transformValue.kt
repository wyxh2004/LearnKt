// 映射可空值（如果非空的话）

val value = ...

val mapped = value?.let { transformValue(it) } ?: defaultValue 

/**
    这个函数的作用是将value应用transformValue函数进行转换，如果value为null，则返回defaultValue。可以看做是将value安全地转换为另一个值的表达式。

    value?.let { transformValue(it) }：使用安全调用操作符?.，如果value不为null，则执行transformValue(it)，其中it为value的值；否则返回null。
    ?: defaultValue：使用空合并操作符?:，如果前面的表达式为null，则返回defaultValue；否则返回前面表达式的结果。
 */