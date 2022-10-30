package ru.netology

data class Comment(
    val id: Int = 0,
    val fromId: Int = 0,
    val date: Long = 0,
    val text: String = "",
    val reply_to_uid: Int = 0
)