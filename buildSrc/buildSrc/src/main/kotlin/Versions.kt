@file:Suppress("MayBeConstant", "SpellCheckingInspection")

object Versions {
    const val versionName = "2.2"
    const val kotlinVersion = "1.4.21"

    const val coroutinesVersion = "1.4.2"
    const val composeVersion = "1.0.0-alpha10"
    const val coilVersion = "0.4.1"
    //DI
    const val kodein = "7.2.0"

    //Internet
    const val ktor = "1.5.0"

    const val kotlinxSerialization = "1.0.1"
    //Database
    const val sqlDelight = "1.4.4"

    const val sqliteJdbcDriver = "3.30.1"
    const val slf4j = "1.7.30"

    //Android
    const val versionCode = 15
    const val minSdkVersion = 24
    const val compileSdkVersion = 30
    const val targetSdkVersion = 29
    const val androidLifecycle = "2.3.0-rc01"
}

object Androidx{
    const val appCompat = "androidx.appcompat:appcompat:1.2.0"
    const val core = "androidx.core:core-ktx:1.5.0-beta01"
    const val palette = "androidx.palette:palette-ktx:1.0.0"
    const val composeNavigation = "androidx.navigation:navigation-compose:1.0.0-alpha05"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"

    const val junit = "androidx.test.ext:junit:1.1.2"
    const val expresso = "androidx.test.espresso:espresso-core:3.3.0"
}
object JetBrains {
    object Kotlin {
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlinVersion}"
        const val testCommon = "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlinVersion}"
        const val testJunit = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlinVersion}"
        const val testAnnotationsCommon = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlinVersion}"
    }

    object Compose {
        // __LATEST_COMPOSE_RELEASE_VERSION__
        private const val VERSION = "0.3.0-build140"
        const val gradlePlugin = "org.jetbrains.compose:compose-gradle-plugin:$VERSION"
        const val materialIcon = "androidx.compose.material:material-icons-extended:${Versions.composeVersion}"
    }
}
object Ktor {
    val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"

    val auth = "io.ktor:ktor-client-auth:${Versions.ktor}"
    val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    val clientDesktop = "io.ktor:ktor-client-curl:${Versions.ktor}"
    val clientApache = "io.ktor:ktor-client-apache:${Versions.ktor}"
    val slf4j = "org.slf4j:slf4j-simple:${Versions.slf4j}"
    val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
    val clientCio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    val clientJs = "io.ktor:ktor-client-js:${Versions.ktor}"
}

object Extras {
    val youtubeDownloader = "com.github.sealedtx:java-youtube-downloader:2.4.6"
    val fuzzyWuzzy = "me.xdrop:fuzzywuzzy:1.3.1"
    val mp3agic = "com.mpatric:mp3agic:0.9.1"
    val jsonKlaxon = "com.beust:klaxon:5.4"
    object Android {
        val razorpay = "com.razorpay:checkout:1.6.4"
        val fetch = "androidx.tonyodev.fetch2:xfetch2:3.1.5"
        val appUpdator = "com.github.amitbd1508:AppUpdater:4.1.0"
    }
}

object JetpackDataStore {
    val dep = "androidx.datastore:datastore-preferences-core:1.0.0-alpha05"
}

object Serialization {
    val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"
}

object SqlDelight {
    val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
    val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"

    const val gradlePlugin = "com.squareup.sqldelight:gradle-plugin:${Versions.sqlDelight}"
    const val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"
    const val sqliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
    const val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
    val nativeDriverMacos = "com.squareup.sqldelight:native-driver-macosx64:${Versions.sqlDelight}"
    val jdbcDriver = "org.xerial:sqlite-jdbc:${Versions.sqliteJdbcDriver}"
}