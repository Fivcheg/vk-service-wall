package ru.netology

interface Attachment {
    val type: String
}

data class Video(val Id: Int, val album_id: Int, val owner_id: Int, val title: String, val duration: Int)
data class Photo(val Id: Int, val album_id: Int, val owner_id: Int, val text: String, val width: Int, val height: Int)
data class Audio(val Id: Int, val album_id: Int, val owner_id: Int, val artist: String, val duration: Int)
data class File(val Id: Int, val owner_id: Int, val title: String, val ext: String, val size: Int)
data class History(val Id: Int, val owner_id: Int, val seen: Boolean, val isDeleted: Boolean, val isExpired: Boolean)

data class VideoAttachment(val video: Video) : Attachment {
    override val type: String = "video"
}

data class PhotoAttachment(val photo: Photo) : Attachment {
    override val type: String = "photo"
}

data class AudioAttachment(val audio: Audio) : Attachment {
    override val type: String = "audio"
}

data class FileAttachment(val file: File) : Attachment {
    override val type: String = "file"
}

data class HistoryAttachment(val history: History) : Attachment {
    override val type: String = "history"
}
