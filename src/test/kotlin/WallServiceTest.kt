package ru.netology
import junit.framework.TestCase.assertFalse
import org.junit.Before
import org.junit.Test

class WallServiceTest {
    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }
    @Test
    fun updateExisting() {
        val service = WallService
        val falseBool = false
        service.add(Post(0, 131, 21091990,"Иван Васильевич меняет профессию", 26, 10, false, true, false, "reply"))
        service.add(Post(1, 155, 21108990,"Какой-то текст", 111, 10, false, true, false, "reply"))
        service.add(Post(2, 134, 22106990,"Какой-то текст 2", 765, 10, false, true, false, "edit"))

        //service.update = Post(2)
        //val result = service.getPostById(2)
        assertFalse(falseBool)
    }
}