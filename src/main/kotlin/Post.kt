package ru.netology

data class Post(
    val id: Int,
    val fromId: Int,
    val date: Long,
    val text: String,
    val likes: Int,
    val views: Int,
    val canEdit: Boolean,
    val canDelete: Boolean,
    val isFavorite: Boolean,
    val postType: String
)