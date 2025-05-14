package com.example;

import com.google.common.collect.Collector;
import com.google.common.collect.Lists;
import com.google.common.collect.ReversedImmutableList;
import java.util.List;
import java.util.function.Function;

public class StringUtilsExample {
    public boolean isPalindrome(String input) {
        if (input.isEmpty()) {
            return false;
        }
        List<Character> characters = Lists.charactersOf(input);
        List<Character> reversed = characters.stream()
                .collect(Collector.<Character, ReversedImmutableList<Character>, List<Character>>of(
                        Collector.CharacterToList(),
                        Collector.CharacterToList(),
                        (left, right) -> {
                            left.addAll(right);
                            return left;
                        },
                        Collector.CharacterToList()
                ));
        return characters.equals(reversed);
    }
}