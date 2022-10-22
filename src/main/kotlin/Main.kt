package ru.netology
fun main() {
    val like1 = Likes(0, true, true, false)
    WallService.add(Post(0, 131, 21091990,"Иван Васильевич меняет профессию", like1.count, 10, false, true, false, "reply"))
    WallService.add(Post(1, 155, 21108990,"Какой-то текст", like1.count, 10, false, true, false, "reply"))
    WallService.add(Post(2, 134, 22106990,"Какой-то текст 2", like1.count, 10, false, true, false, "edit"))
    WallService.add(Post(3, 166, 23101990,"Какой-то текст 34", like1.count, 10, false, true, false, "copy"))
    WallService.add(Post(4, 111, 25101990,"Какой-то текст 77", like1.count, 10, false, true, false, "reply"))
    WallService.add(Post(5, 131, 21091990,"Иван Васильевич меняет профессию", like1.count, 10, false, true, false, "reply"))

    WallService.update(2)

    try {
        println(WallService.getPostById(2))
    }
    catch(e:ArrayIndexOutOfBoundsException){
        println("Вне диапазона")
    }

}

