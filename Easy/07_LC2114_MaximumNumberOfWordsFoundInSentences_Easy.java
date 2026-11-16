class Solution {
    public int mostWordsFound(String[] sentences) {
        int output = 1;

        for(int i = 0; i < sentences.length; i++){

            int word_count = 1;

            String sentence = sentences[i];

            for(int j = 0; j < sentence.length(); j++){
                if (sentence.charAt(j) == ' '){
                    word_count++;
                }
            }
            if(word_count > output){
                output = word_count;
            }
        }
        return output;
    }
}
