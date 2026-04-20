public class Programm {
    public static void main(String[] args){

        TextAnalyzer text = new TextAnalyzer(
                "Я к вам пишу — чего же боле?\n" +
                "Что я могу еще сказать?\n" +
                "Теперь, я знаю, в вашей воле\n" +
                "Меня презреньем наказать..."
        );

        System.out.print(text.getUniqueWords() + "\n");
        System.out.print(text.getWordCount() + "\n");
        System.out.print(text.getSortedWords());
    }
}
