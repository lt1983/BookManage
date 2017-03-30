package com.tars.repository;

import com.tars.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Tars on 2017/3/30.
 */
public interface ReaderRepository extends JpaRepository<Reader,String> {
}
