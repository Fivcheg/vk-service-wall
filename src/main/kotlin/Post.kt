package ru.netology

data class Post(
    val id: Int = 0,
    val fromId: Int = 0,
    val date: Long = 0,
    val text: String = "",
    val likes: Int = 0,
    val views: Int = 0,
    val description: String?,
    val canEdit: Boolean = false,
    val canDelete: Boolean = false,
    val isFavorite: Boolean = false,
    val postType: String  = ""
)