package mx.test.videomeeting.listeners;

import mx.test.videomeeting.models.User;

public interface UserListener {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);
}
