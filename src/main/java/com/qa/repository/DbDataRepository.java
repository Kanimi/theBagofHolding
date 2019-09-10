package com.qa.repository;
import com.qa.models.DbData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbDataRepository extends JpaRepository<DbData, Long>{

}
