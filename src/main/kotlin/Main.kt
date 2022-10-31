package ru.netology
fun main() {
    val like1 = Likes(0, true, true, false)
    val audio1 = Attachment.AudioAttachment(Attachment.Audio(3, 5, 3, "Певец", 150))
    val attachmentsTest1: Array<Attachment> = arrayOf(Attachment.VideoAttachment(Attachment.Video(6, 7, 3, "SuperVideo", 400)), Attachment.AudioAttachment(Attachment.Audio(3, 5, 3, "Певец", 150)))
    val attachmentsTest2: Array<Attachment> = arrayOf(Attachment.AudioAttachment(Attachment.Audio(3, 5, 3, "Певец", 150)), Attachment.VideoAttachment(Attachment.Video(6, 7, 3, "SuperVideo", 400)))
    val attachmentsTest3: Array<Attachment> = arrayOf(Attachment.FileAttachment(Attachment.File(3, 55, "Syberia", "exe", 3463421)), Attachment.HistoryAttachment(Attachment.History(3,44,true, false, true)), Attachment.PhotoAttachment(Attachment.Photo(8, 21,66, "Bla-bla-bla", 1234, 2234)))
    WallService.add(Post(0, 131, 21091990,"Иван Васильевич меняет профессию", like1.count, 10, "Текст1", false, true, false, "reply", attachmentsTest1))
    WallService.add(Post(1, 155, 21108990,"Какой-то текст", like1.count, 10, "Текст1",false, true, false, "reply"))
    WallService.add(Post(2, 134, 22106990,"Какой-то текст 2", like1.count, 500, null,false, true, false, "edit", attachmentsTest2))
    WallService.add(Post(3, 166, 23101990,"Какой-то текст 34", like1.count, 33, null,false, true, false, "copy"))
    WallService.add(Post(4, 111, 25101990,"Какой-то текст 77", like1.count, 10, "Текст1",false, true, false, "reply", attachmentsTest3))
    WallService.add(Post(5, 131, 21091990,"Иван Васильевич меняет профессию", like1.count, 10, "Текст1",false, true, false, "reply"))

    WallService.update(2)
    println(WallService.createComment(3, Comment(3, 66, 12314, "Первый коммент", 33)))
    //println(WallService.createComment(13, Comment(13, 66, 12314, "Первый коммент", 33)))
    try {
        println(WallService.getPostById(2))
    }
    catch(e:ArrayIndexOutOfBoundsException){
        println("Нет такого поста")
    }
        //println(audio1.type)

}

