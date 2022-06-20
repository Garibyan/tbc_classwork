class Math {

    fun lcm(number1: Int, number2: Int): Int {
        var lcm: Int
        if (number1 <= 0 || number2 <= 0) {
            return -1
        } else {
            lcm = if (number1 > number2) number1 else number2

            while (true) {
                if (lcm % number1 == 0 && lcm % number2 == 0) {
                    break
                }
                ++lcm
            }
        }
        return lcm
    }

    fun gcd(number1: Int, number2: Int): Int {
        var gcd: Int = 0
        var i = 1

        if (number1 <= 0 || number2 <= 0) {
            return -1
        } else {
            while (i <= number1 && i <= number2) {
                if (number1 % i == 0 && number2 % i == 0)
                    gcd = i
                ++i
            }
        }
        return gcd
    }

    fun containsDollorSign(string: String): Boolean = string.contains("$")

    fun recursionCalculation(number: Int): Int {
        return if (number == 2) number else number + recursionCalculation(number - 2)
    }

    fun reversedInt(number: Int): Int {
        var reversedInt = 0
        var num = number

        while (num != 0) {
            reversedInt = reversedInt * 10 + num % 10
            num /= 10
        }
        return reversedInt
    }

    fun isPolindrom(string: String): Boolean = string.equals(string.reversed())

}