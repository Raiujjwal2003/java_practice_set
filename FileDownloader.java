
import java.io.*;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileDownloader {
    public static void main(String[] args) {
        String fileUrl = "https://example.com/sample.zip"; // Replace with the actual URL
        String downloadDirectory = "C:\\DownloadedFiles";
        String extractedDirectory = "C:\\Extracted Folder";

        try {
            URL url = new URL(fileUrl);
            String fileName = fileUrl.substring(fileUrl.lastIndexOf('/') + 1);

            // Create the download directory if it doesn't exist
            File downloadDir = new File(downloadDirectory);
            if (!downloadDir.exists()) {
                downloadDir.mkdirs();
            }

            // Download the file
            File downloadedFile = new File(downloadDirectory, fileName);
            FileUtils.copyURLToFile(url, downloadedFile);

            // Check if the downloaded file is a zip file
            if (fileName.endsWith(".zip")) {
                // Create the extracted directory if it doesn't exist
                File extractedDir = new File(extractedDirectory);
                if (!extractedDir.exists()) {
                    extractedDir.mkdirs();
                }

                // Extract the zip file
                try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(downloadedFile))) {
                    ZipEntry entry;
                    while ((entry = zipInputStream.getNextEntry()) != null) {
                        String entryName = entry.getName();
                        File entryFile = new File(extractedDirectory, entryName);

                        // Create parent directories if they don't exist
                        if (!entryFile.getParentFile().exists()) {
                            entryFile.getParentFile().mkdirs();
                        }

                        if (!entry.isDirectory()) {
                            // Copy the entry from the zip file
                            try (OutputStream outputStream = new FileOutputStream(entryFile)) {
                                byte[] buffer = new byte[1024];
                                int length;
                                while ((length = zipInputStream.read(buffer)) > 0) {
                                    outputStream.write(buffer, 0, length);
                                }
                            }
                        }
                    }
                }
                System.out.println("Zip file " + fileName + " extracted to " + extractedDirectory);
            } else {
                System.out.println("File " + fileName + " downloaded to " + downloadDirectory);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
