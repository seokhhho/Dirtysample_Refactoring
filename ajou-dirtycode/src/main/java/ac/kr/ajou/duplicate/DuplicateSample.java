package ac.kr.ajou.duplicate;

public class DuplicateSample {

    public int calc(EventData eventData) {
        if (eventData.getPrice() > 10) {
            logPriceAndName(eventData);
            return 1;
        }
            if (eventData.getEventName().equals("test")) {
                logPriceAndName(eventData);
                return 2;

        }

        return 0;
    }

    private void logPriceAndName(EventData ed) {
        System.out.println(ed.getPrice());
        System.out.println(ed.getEventName());
    }
}
