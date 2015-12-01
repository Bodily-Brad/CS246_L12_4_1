/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author brandon
 */
public class YoutubeVideoAdapter implements SocialMediaEntry {
    
    private YouTubeVideo myVideo;
    
    public YoutubeVideoAdapter(YouTubeVideo video) {
        myVideo = video;
    }
    
    @Override
    public String getUser() {
        return myVideo.getAuthor();
    }
    
    @Override
    public String getPostText() {
        return myVideo.getTitle() + " - " + myVideo.getDescription();
    }
    
}
