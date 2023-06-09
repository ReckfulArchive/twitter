package org.reckful.archive.twitter.server.importer.vicinitas

import org.springframework.boot.context.properties.ConfigurationProperties
import java.io.File

@ConfigurationProperties(prefix = "importer.data.vicinitas")
data class VicinitasTweetDataProperties(
    val historicalTweetsTsv: List<File>,
    val freeTweetsTsv: List<File>,
)
