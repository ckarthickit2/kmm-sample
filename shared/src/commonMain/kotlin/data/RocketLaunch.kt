package data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * @author [Karthick Chinnathambi](https://github.com/karthick-rapido)
 * @since 20/02/24
 */
@Serializable
data class RocketLaunch (
        @SerialName("flight_number")
        val flightNumber: Int,
        @SerialName("name")
        val missionName: String,
        @SerialName("date_utc")
        val launchDateUTC: String,
        @SerialName("success")
        val launchSuccess: Boolean?,
)