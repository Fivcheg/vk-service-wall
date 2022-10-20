package ru.netology

class Likes(count: Int, user_likes: Boolean, can_likes: Boolean, can_publish: Boolean) {
    var count = count
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}