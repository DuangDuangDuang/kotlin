// IGNORE_BACKEND: JVM_IR
fun Int.digitsUpto(end: Int): Int {
    var sum = 0
    for (i in rangeTo(end)) {
        sum = sum*10 + i
    }
    return sum
}

// 0 iterator
// 0 getStart
// 0 getEnd
// 0 getFirst
// 0 getLast
