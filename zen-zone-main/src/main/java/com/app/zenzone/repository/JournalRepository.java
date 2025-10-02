package com.app.zenzone.repository;

import com.app.zenzone.model.Journal;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {


   
}
