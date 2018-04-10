public class Info {
    String name;
    int duration;
    int mark;
    void status(){
        System.out.println(name + " is on air");
    }

    Info (String filmName, int filmDuration, int filmMark){
        name = filmName;
        duration = filmDuration;
        mark = filmMark;
    }

    Info (String filmName){
        name = filmName;
        duration = -1;
        mark = -1;
    }

    int getDuration(){
        return duration;
    }

    void durationInfo(){
        if (duration < 0)
            System.out.println("Duration is unknown.");
        else
            System.out.println("Film lasts for " + duration + " minutes");
    }

    void markInfo(){
        if (mark < 0)
            System.out.println("Mark wasn't assigned");
        else
            System.out.println("Film is rated on" + mark + " out of 5.");
    }
}
