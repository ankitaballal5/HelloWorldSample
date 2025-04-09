```java
public boolean isPalindrome(String input) {
    if (input == null || input.isEmpty()) {
        return false;
    }
    return new StringBuilder(input).reverse().toString().equals(input);
}
```