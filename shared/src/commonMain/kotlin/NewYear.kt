import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.plus
import kotlinx.datetime.todayIn

/**
 * @author [Karthick Chinnathambi](https://github.com/karthick-rapido)
 * @since 19/02/24
 */

fun daysUntilNewYear(): Int {
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
    val closestNewYear = LocalDate(today.year + 1 , 1, 1)
    return today.daysUntil(closestNewYear)
}

fun daysPhrase(): String {
    return "There are only ${daysUntilNewYear()} days left until New Year! \uD83C\uDF86"
}