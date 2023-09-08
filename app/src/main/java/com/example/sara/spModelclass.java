package com.example.sara;

public class spModelclass extends Modelclass {
        String Question;
        String Answer;

        public spModelclass(String question, String answer) {
            Question = question;
            Answer = answer;
        }

        public String getQuestion() {
            return Question;
        }

        public void setQuestion(String question) {
            Question = question;
        }

        public String getAnswer() {
            return Answer;
        }

        public void setAnswer(String answer) {
            Answer = answer;
        }


}
