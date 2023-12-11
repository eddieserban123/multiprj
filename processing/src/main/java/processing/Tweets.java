package processing;

public class Tweets {

    public String annalyze(String msg) {
        if (msg.contains("Hi")) return "nice msg";
        if (msg.contains("Huo")) return "rude msg";
        return "not_know msg";
    }


}
