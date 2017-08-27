import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.shijian.library.entity.Book;
import org.junit.Before;
import org.junit.Test;
import com.shijian.library.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.Reader;


public class BookMapperTest {
    private ApplicationContext applicationContext;
    private BookDao bookDao;
    //注解before是指在执行本类所有方法之前先执行这个
    @Before
    @Test
    public void setup(){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
        bookDao = (BookDao) applicationContext.getBean("BookDao");
        System.out.println(bookDao+"111");

    }
    @Test
    public void test1(){
        Book book = bookDao.BookFindByIsbn("10001");
        System.out.println(book);
    }

}
