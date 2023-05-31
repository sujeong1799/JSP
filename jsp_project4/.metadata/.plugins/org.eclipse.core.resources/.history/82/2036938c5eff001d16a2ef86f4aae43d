package handler;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileHandler {
	private static Logger log = LoggerFactory.getLogger(FileHandler.class);
	
	//파일이름과 경로를 받아서 파일을 삭제하는 메서드
	//리턴타입 int => 잘 삭제되었는지 체크하기 위한 변수 (==isOk)
	public int deleteFile(String imageFileName, String savePath) {
		//파일을 삭제하는 메서드의 리턴 타입이 boolean
		boolean isDel = false;
		log.info(">>> deleteFile method 접근");
		log.info(">>> imageFileName > "+imageFileName);
		
		File fileDir = new File(savePath);
		File removeFile = new File(fileDir+File.separator+imageFileName);
		File removeThumbFile = new File(fileDir+File.separator+"th_"+imageFileName);
		
		//파일이 있는지(존재하는지) 확인 => 삭제
		if(removeFile.exists() || removeThumbFile.exists()) {
			isDel = removeFile.delete(); //리턴 형태는 boolean
			log.info(">>> remove File > "+(isDel ? "OK":"Fail"));
			if(isDel) { //메인 파일이 지워졌다면 썸네일 파일도 삭제
				isDel = removeThumbFile.delete();
				log.info(">>> remove ThumbFile > "+(isDel ? "OK":"Fail"));
			}
		}
		log.info(">>>> FileHandler remove Ok");
		return isDel? 1 : 0;
	}
}
