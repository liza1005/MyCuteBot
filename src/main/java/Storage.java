import java.util.ArrayList;

public class Storage {
	private ArrayList<String> greetingList;
	private ArrayList<String> quotesList;

	private ArrayList<String> emojiList;

	Storage() {
		greetingList = new ArrayList<>();
		greetingList.add("Привет");
		greetingList.add("Здравствуй");
		greetingList.add("Здравия желаю");
		greetingList.add("Доброго времени суток");

		quotesList = new ArrayList<>();
		quotesList.add("Доброта лучше красоты. (Генрих Гейне)");
		quotesList.add("Сильно желание чему-то научиться — это уже 50% успеха!");
		quotesList.add("На чужом несчастье счастье не построишь");
		quotesList.add("Что делать с ошибкой: признать, принять, извлечь урок, забыть.");

		emojiList = new ArrayList<>();
		emojiList.add("\uD83D\uDE0D");
		emojiList.add("\uD83E\uDD70");
		emojiList.add("❤");
		emojiList.add("\uD83E\uDD29");
		emojiList.add("\uD83E\uDD79");
		emojiList.add("\uD83D\uDE1A");
		emojiList.add("\uD83E\uDEE5");

	}

	private int getIndex(ArrayList<String> arr) {
		return (int) (Math.random() * arr.size());
	}

	String getRandomGreeting() {
		return greetingList.get(getIndex(greetingList));
	}

	String getRandomQuote() {
		return quotesList.get(getIndex(quotesList));
	}

	String getRandomEmoji() {
		return emojiList.get(getIndex(emojiList));
	}


}
