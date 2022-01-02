@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая (2 балла)
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {
    val num_one_a = number / 1000
    val num_one_b = (number / 100) % 10
    val num_two_a = (number % 100) / 10
    val num_two_b = (number % 10)
    val result_one = num_one_a + num_one_b
    val result_two = num_two_a + num_two_b

    return result_one == result_two
}

/**
 * Простая (2 балла)
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    if (x1 == x2) {
        return true
    } else if (y1 == y2) {
        return true
    } else if (x2 - x1 == y2 - y1) {
        return true
    } else if ((x2 - x1) == 1) {
        return true
    } else if ((x2 - x1) == -1) {
        return true
    } else if ((y2 - y1 == 1)) {
        return true
    } else if ((y2 - y1 == -1)) {
        return true
    } else {
        return false
    }

}


/**
 * Простая (2 балла)
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int {
    var leapYear = (year % 4 == 0)
    if (year >= 1700 && year % 100 == 0 && year % 400 != 0) {
        leapYear = false
    }
    when (month) {
        1 -> return 31
        3 -> return 31
        5 -> return 31
        7 -> return 31
        8 -> return 31
        10 -> return 31
        12 -> return 31
        4 -> return 30
        6 -> return 30
        9 -> return 30
        11 -> return 30
        2 -> (return if (leapYear) {
            29
        } else {
            28
        })
        else -> return 0

    }
}

/**
 * Простая (2 балла)
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double
): Boolean = TODO()

/**
 * Средняя (3 балла)
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
    return if (a <= r && b <= s) {
        true
    } else if (a <= s && b <= r) {
        true
    } else if (a <= r && c <= s) {
        true
    } else if (c <= r && a <= s) {
        true
    } else if (b <= r && c <= s) {
        true
    } else b <= s && c <= r
}