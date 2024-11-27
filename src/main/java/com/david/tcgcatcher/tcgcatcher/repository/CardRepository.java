package com.david.tcgcatcher.tcgcatcher.repository;

import com.david.tcgcatcher.tcgcatcher.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
}
