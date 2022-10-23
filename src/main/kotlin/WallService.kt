package ru.netology

import java.util.*
import kotlin.random.Random

object WallService {
    private var posts = emptyArray<Post>()
    private var idCounter = 0
    fun clear() {
        posts = emptyArray()
    }
    fun add(post: Post): Boolean {
        var x = true
        if (post.id == idCounter){
            posts += post
            idCounter++
        } else{
            x = false
        }
          return x
    }

    fun update(id: Int): Boolean {
        var x = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(
                    likes = post.likes + Random.nextInt(from = 1, until = 150),
                    text = post.text + " изменен " + Calendar.getInstance().time,
                    views = post.views + Random.nextInt(from = 1, until = 250),
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

