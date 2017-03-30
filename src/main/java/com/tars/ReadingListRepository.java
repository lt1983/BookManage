package com.tars;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Tars on 2017/3/30.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
