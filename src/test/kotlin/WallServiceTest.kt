package ru.netology
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test


class WallServiceTest {
   /* @Before
    fun clearBeforeTest() {
        WallService.clear()
    }*/
    @Test
    fun updateExistingTrue() {
        val service = WallService
        service.add(Post(0, 131, 21091990,"Иван Васильевич меняет профессию", 26, 10, false, true, false, "reply"))
        service.add(Post(1, 155, 21108990,"Какой-то текст", 111, 10, false, true, false, "reply"))
        service.add(Post(2, 134, 22106990,"Какой-то текст 2", 765, 10, false, true, false, "edit"))
        val x = service.update(2)
        assertTrue(x)
    }
    @Test
    fun updateExistingFalse() {
        val service = WallService
        service.add(Post(0, 131, 21091990,"Иван Васильевич меняет профессию", 26, 10, false, true, false, "reply"))
        service.add(Post(1, 155, 21108990,"Какой-то текст", 111, 10, false, true, false, "reply"))
        service.add(Post(2, 134, 22106990,"Какой-то текст 2", 765, 10, false, true, false, "edit"))
        val x = service.update(5)
        assertFalse(x)
    }
    @Test
    fun addTestTrue(){
        val service = WallService
        val x = service.add(Post(0, 134, 22106990,"Какой-то текст 2", 765, 10, false, true, false, "edit"))
        assertTrue(x)
    }
    @Test
    fun addTestFalse(){
        val service = WallService
        val x = service.add(Post(6, 134, 22106990,"Какой-то текст 2", 765, 10, false, true, false, "edit"))
        assertFalse(x)
    }
}
