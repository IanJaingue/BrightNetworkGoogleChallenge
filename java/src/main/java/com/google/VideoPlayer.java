package com.google;
import java.util.Arrays;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }
  private String currentVideoID = "";

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos()
  {
String[] arr = new String[videoLibrary.getVideos().size()];
    System.out.println("This is the list of all of the videos: ");
    for(int i = 0; i < videoLibrary.getVideos().size(); i++){
      arr[i] = videoLibrary.getVideos().get(i).getTitle() + "(" + videoLibrary.getVideos().get(i).getVideoId() + ") " +
              videoLibrary.getVideos().get(i).getTags().toString().replaceAll(",","");

    }
    Arrays.sort(arr);

    for(int i = 0; i< arr.length; i++){
      System.out.println(arr[i]);
    }

  }

  public void playVideo(String videoId) {
    boolean doesExist = false;
    String videoTitle = "";
    for (int i = 0; i < videoLibrary.getVideos().size(); i++) {
      if(videoLibrary.getVideos().get(i).getVideoId().contains(videoId))
      {
        doesExist = true;
        videoTitle = videoLibrary.getVideo(videoId).getTitle();
        break;
        // This access all the videos on the list (only the title).
      }
    }
    if (doesExist == true) {
      System.out.println("Playing video : " + videoTitle);
    } else {
      System.out.println("Cannot play video: Video does not exist");
    }
  }
  public void currentVideo(){

  }

  public void stopVideo(){
    {
    if(currentVideoID != ""){
      System.out.println("Stopping video: " + videoLibrary.getVideo(currentVideoID).getTitle());
      currentVideoID = "";
    }else{
      System.out.println("Cannot stop video: No video is currently playing");
    }
    }

    System.out.println("stopVideo needs implementation");
  }

  public void playRandomVideo() {
    Random r = new Random();
    int randomVideoIndex = r.nextInt(video.size());
    pause = false;
    if(currentVideo !=null) {
      stopVideo();

      playVideo(videos.get(randomVideoIndex).getVideoId());
    } else if(currentVideo == null){
      playVideo(videos.get(randomVideoIndex).getVideoId());


    }

    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}