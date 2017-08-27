package com.shijian.library.dao;





import java.util.List;
import com.shijian.library.entity.Book;

public interface BookDao {
    Book BookFindByIsbn(String isbn);
    List<Book> findAll();
}
