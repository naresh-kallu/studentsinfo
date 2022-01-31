package com.naresh.JavaTrining.Dao;
import com.naresh.JavaTrining.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JavaTriningRepository extends JpaRepository<JavaTriningModel, Long> {

}
