import java.util.*


fun main() {
    val obj= Scanner(System.`in`)
    var str=obj.nextLine()
    val ree = LinkedHashMap<Char, Int>()
    for (i in 0 until str.length) {
        if (ree[str[i]] != null) {
            ree[str[i]] = ree[str[i]]!! + 1
        } else {
            ree[str[i]] = 1
        }
    }
    val tempChar: Iterator<Char> = ree.keys.iterator()
    while (tempChar.hasNext()) {
        val ch = tempChar.next()
        if (ch!=' ')
        println(ch.toString() + " " + ree[ch])
    }
}