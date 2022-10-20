package ru.netology

class Post(
    id: Int,
    fromId: Int,
    date: Long,
    var text: String,
    var likes: Int,
    views: Int,
    var canEdit: Boolean,
    var canDelete: Boolean,
    var isFavorite: Boolean,
    postType: String
) {
    var postType = postType
        set(value) {
            if (value == "reply" || value == "post" || value == "copy" || value == "postpone" || value == "suggest") {
                field = value
            }
        }
    var views = views
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var date = date
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var fromId = fromId
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
    var id = id
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}