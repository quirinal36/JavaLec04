package lee.hyoung.gu.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import org.json.JSONObject;

public class FileControl {
	static final Logger logger = Logger.getLogger(FileControl.class.getSimpleName());
	
	public static void main(String[] args) {
		final String fileTitle = "myjson.json";
		
		FileControl fileControl = new FileControl();
		fileControl.writeFile(fileTitle, "파일내용");
		
		logger.info(fileControl.readFile(fileTitle));
		
		JSONObject updateJson = new JSONObject();
		final String nowDate = LocalDateTime.now().toString();
		updateJson.put("update", nowDate);
		fileControl.appendFile(fileTitle, updateJson.toString());
		
		logger.info(fileControl.readFile(fileTitle));
		fileControl.deleteFile(fileTitle);
	}
	
	/**
	 * 파일 삭제하기
	 * 
	 * @param title
	 * @return
	 */
	public boolean deleteFile(String title) {
		boolean result = false;
		File storedFile = new File(title);
		if(storedFile.exists()) {
			result = storedFile.delete();
		}
		return result;
	}
	
	/**
	 * 파일 수정하기
	 * 
	 * @param title
	 * @param content
	 */
	public void appendFile(String title, String content) {
		File storedFile = new File(title);
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(storedFile, true))){
			writer.append(content);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 파일 읽기
	 * 
	 * @param title
	 * @return
	 */
	public String readFile(String title) {
		StringBuilder result = new StringBuilder();
		File storedFile = new File(title);
		
		try(BufferedReader reader = new BufferedReader(new FileReader(storedFile))){
			String line;
			while((line = reader.readLine()) != null) {
				result.append(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	/**
	 * 파일 생성 및 텍스트쓰기
	 * 
	 * @param title
	 * @param content
	 */
	public void writeFile(String title, String content) {
		File newFile = new File(title);
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))){
			writer.write(content);
			
			logger.info(newFile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
