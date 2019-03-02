package hackalakin.org.popcornperfect;

import android.media.MediaRecorder;

public class RecordPops {
    MediaRecorder recorder = new MediaRecorder();
    recorder.setAudioSource(recorder.AudioSource.MIC);
    recorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
    recorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
    recorder.setOutputFile();

    recorder.prepare();
    recorder.start();   // Recording is now started
    //do stuff
    recorder.stop();
    recorder.reset();   // You can reuse the object by going back to setAudioSource() step
    recorder.release(); // Now the object cannot be reused
}
