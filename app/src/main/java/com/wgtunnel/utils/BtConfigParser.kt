package com.wgtunnel.utils

import org.json.JSONObject

object BtConfigParser {
    data class BtConfig(
        val app: String,
        val version: Int,
        val type: String,
        val name: String,
        val config: String
    )

    fun parse(jsonString: String): BtConfig? {
        return try {
            val json = JSONObject(jsonString)
            BtConfig(
                app = json.optString("app", "BlitzTech VPN"),
                version = json.optInt("version", 1),
                type = json.optString("type", "wireguard"),
                name = json.optString("name", "Imported Config"),
                config = json.getString("config")
            )
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
