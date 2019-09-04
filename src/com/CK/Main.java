package com.CK;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public boolean validWordSquare(List<String> words) {
        int size = words.size();
        if (size == 0)
            return false;

        for (int i = 0; i < size; i++){
            int wordsLen = words.get(i).length();
            for (int j = 0;j < wordsLen; j++){
                if (j >= size || i >= words.get(j).length())
                    return false;
                if (words.get(i).charAt(j) != words.get(j).charAt(i))
                    return false;
            }
        }
        return true;
    }
}