package exercises.technology;

import java.util.concurrent.atomic.AtomicLong;

public abstract class AbstractEntity {
    private static AtomicLong idCounter = new AtomicLong();

    public static String createID()
    {
        return String.valueOf(idCounter.getAndIncrement());
    }
}
