package com.elisa;

/**
 * Created by elisa on 18/08/15.
 */
public class Writer {
        private SpellChecker spellChecker;

        // a setter method to inject the dependency.
        public void setSpellChecker(SpellChecker spellChecker) {
            System.out.println("Inside setSpellChecker." );
            this.spellChecker = spellChecker;
        }
        // a getter method to return spellChecker
        public SpellChecker getSpellChecker() {
            return spellChecker;
        }

        public void spellCheck() {
            spellChecker.checkSpelling();
        }
    }
