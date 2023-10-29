import java.util.Date;

public class ClassicalCD {
    private String composer;
    private String[] performers = new String[5];
    private String recordingLocation;
    private Date releaseDate;
    private int performerCount = 0;

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRecordingLocation() {
        return recordingLocation;
    }

    public void setRecordingLocation(String recordingLocation) {
        this.recordingLocation = recordingLocation;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    public void addPerformer(String performer){
        if(performerCount >= performers.length)
            System.out.println("The performers array is full! Cannot add " + performer);
        else {
            performers[performerCount] = performer;
            performerCount++;
        }

    }
    public void showPerformers(){
        if (performerCount == 0)
            System.out.println("No performers have been added for this CD");
        for(int i = 0; i < performerCount; i++){
            System.out.println("Values are in the array: " + performers[i]);
        }
    }
}
