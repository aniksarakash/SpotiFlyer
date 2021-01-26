/*
 * Copyright (c)  2021  Shabinder Singh
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.shabinder.common.gaana

import com.shabinder.common.DownloadStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GaanaTrack (
    val tags : List<Tags?>?,
    val seokey : String,
    val albumseokey : String?,
    val track_title : String,
    val album_title : String?,
    val language : String?,
    val duration: Int,
    @SerialName("artwork_large") val artworkLink : String,
    val artist : List<Artist?>,
    @SerialName("gener") val genre : List<Genre?>?,
    val lyrics_url : String?,
    val youtube_id : String?,
    val total_favourite_count : Int?,
    val release_date : String?,
    val play_ct : String?,
    val secondary_language : String?,
    var downloaded: DownloadStatus? = DownloadStatus.NotDownloaded
)