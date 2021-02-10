package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface SpellChecker {
	@Autowired
	public String checkSpell(String text);
	
}
