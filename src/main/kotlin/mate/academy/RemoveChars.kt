package mate.academy

const val NUMBER_OF_CHARACTERS = 1

fun removeChars(str: String): String {
    return str.drop(NUMBER_OF_CHARACTERS).dropLast(NUMBER_OF_CHARACTERS)
}
