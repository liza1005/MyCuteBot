import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


public class App {

	public static void main(String[] args) throws TelegramApiException {
		try {
			TelegramBotsApi botApi = new TelegramBotsApi(DefaultBotSession.class);
			botApi.registerBot(new MyCute());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}
