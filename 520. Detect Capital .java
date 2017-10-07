/*
520. Detect Capital 
 Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital if it has more than one letter, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way. 

return word.equals(word.toUpperCase()) || 
               word.equals(word.toLowerCase()) ||
               Character.isUpperCase(word.charAt(0)) && 
               word.substring(1).equals(word.substring(1).toLowerCase());
 return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
*/
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }else if(word.equals(word.toLowerCase())){
            return true;
        }else if(word.equals(String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}