package ru.netology

import java.util.*
import kotlin.random.Random

object WallService {
    private var posts = emptyArray<Post>()
    private var idCounter = 0
    private var idCounterComment = 0
    private var comments = emptyArray<Comment>()
    fun clear() {
        posts = emptyArray()
        comments = emptyArray()
        idCounter = 0
    }
    class PostNotFoundException : Exception("Пост не найден!")
    fun createComment(postId: Int, comment: Comment): Comment? {
        var varComment: Comment? = null
        for (post in posts) {
            if (postId == post.id) {
                comments += comment.copy(id = idCounterComment++)
                varComment = comments.last()
                break
            }
        }
        return varComment ?: throw PostNotFoundException()
    }

    fun add(post: Post): Post {
        posts += post.copy(id = idCounter++)
        return posts.last()
    }

    fun update(id: Int): Boolean {
        var x = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(
                    likes = post.likes + Random.nextInt(from = 1, until = 150),
                    text = post.text + " изменен " + Calendar.getInstance().time,
                    views = post.views + Random.nextInt(from = 1, until = 250),
                    description = "Какой-то небольшой текст",
                    canEdit = true,
                    canDelete = true,
                    isFavorite = true,
                    postType = "reply"
                )
                x = true
            }
        }
        return x
    }
    fun getPostById(indexPost:Int):Post{
        return posts[indexPost]
    }
}

