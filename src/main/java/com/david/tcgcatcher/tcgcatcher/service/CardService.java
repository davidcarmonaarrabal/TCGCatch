package com.david.tcgcatcher.tcgcatcher.service;

import com.david.tcgcatcher.tcgcatcher.model.Card;
import com.david.tcgcatcher.tcgcatcher.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    @Autowired
    private CardRepository cardRepository;

    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }

    public Card saveCard(Card card){
        return cardRepository.save(card);
    }

    public Card getCardById(Long id){
        return cardRepository.findById(id).orElse(null);
    }

    public void deleteCard(Long id){
        cardRepository.deleteById(id);
    }
}
