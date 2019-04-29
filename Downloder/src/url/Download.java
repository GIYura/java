package url;

import java.io.*;
import java.net.*;

public class Download implements Runnable {

	String link;
	File out;
	
	public Download(String link, File out) {
		this.link = link;
		this.out = out;
	}

	@Override
	public void run() {
		try {
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			double fileSize = (double)http.getContentLength();
			BufferedInputStream in = new BufferedInputStream(http.getInputStream());
			FileOutputStream fos = new FileOutputStream(this.out);
			BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
			byte[] buffer = new byte[1024];
			double downloaded = 0.00;
			int read = 0;
			double persentDownloaded = 0.00;
		
			while ((read = in.read(buffer, 0, 1024)) >= 0) {
				bout.write(buffer, 0, read);
				downloaded += read;
				persentDownloaded = (downloaded * 100) / fileSize;
				String percent = String.format("%4.4f", persentDownloaded);
				System.out.println("Dowloaded " + percent + "% of file");
			}
			bout.close();
			in.close();
			System.out.println("Download complete");
		
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
}
