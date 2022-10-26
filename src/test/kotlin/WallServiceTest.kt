package ru.netology
import junit.framework.TestCase.*
import org.junit.Before
import org.junit.Test


class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }
    @Test
    fun addExisting() {
        val service = WallService
        val indexPostTest = 3
        val x = service.add(Post(indexPostTest, 134, 22106990,"Какой-то текст 2", 765, 10, "Текст1", false, true, false, "edit"))
        val y: Boolean =  indexPostTest == x.id
        assertFalse(y)

    }
    @Test
    fun updateExistingTrue() {
        val service = WallService
        service.add(Post(2, 131, 21091990,"Иван Васильевич меняет профессию", 26, 10, "Текст1", false, true, false, "reply"))
        val u = service.update(0)
        println(u)
        assertTrue(u)
    }
    @Test
    fun updateExistingFalse() {
        val service = WallService
        service.add(Post(0, 131, 21091990,"Иван Васильевич меняет профессию", 26, 10, "Текст1", false, true, false, "reply"))
        val x = service.update(5)
        assertFalse(x)
    }

}
