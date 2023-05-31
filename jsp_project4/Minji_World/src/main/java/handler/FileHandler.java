package handler;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileHandler {
	private static Logger log = LoggerFactory.getLogger(FileHandler.class);
	

	public int deleteFile(String imageFileName, String savePath) {

		boolean isDel = false;
		log.info(">>> deleteFile method 접근");
		log.info(">>> imageFileName > "+imageFileName);
		
		File fileDir = new File(savePath);
		File removeFile = new File(fileDir+File.separator+imageFileName);
		File removeThumbFile = new File(fileDir+File.separator+"th_"+imageFileName);
		

		if(removeFile.exists() || removeThumbFile.exists()) {
			isDel = removeFile.delete();
			log.info(">>> remove File > "+(isDel ? "OK":"Fail"));
			if(isDel) {
				isDel = removeThumbFile.delete();
				log.info(">>> remove ThumbFile > "+(isDel ? "OK":"Fail"));
			}
		}
		log.info(">>>> FileHandler remove Ok");
		return isDel? 1 : 0;
	}
}
