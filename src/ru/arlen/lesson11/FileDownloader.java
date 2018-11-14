package ru.arlen.lesson11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileDownloader {
    private static String PATH = "D:/";
    private static int THREAD_COUNT = 2;

    public static void main(String[] args) {
        String url1 = "https://cdn.journaldev.com/wp-content/uploads/2015/03/apache-httpclient-example-closeablehttpclient.jpg";
        String url2 = "https://i.ytimg.com/vi/DveaDNHEhbg/maxresdefault.jpg";
        String url3 = "https://1.bp.blogspot.com/-sin6caH1Vag/WYLhBIidatI/AAAAAAAAAF8/OZ-RO4FJJC0xaipUpbdS-c5CGtXcFQcxwCLcBGAs/s1600/Outsourcing%2BWeb%2BPortal%2BDevelopment%2BSolutions.gif";
        long start = System.nanoTime();
        downloadFile(url1);
        downloadFile(url2);
        downloadFile(url3);
        long end = System.nanoTime();
        System.out.println("DONE!");
        System.out.println("It takes " + TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS) + " ms\n");

        long start2 = System.nanoTime();
        downloadFiles(new String[]{url1, url2, url3});
        long end2 = System.nanoTime();
        System.out.println("It takes " + TimeUnit.MILLISECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS) + " ms\n");
    }

    private static void downloadFile(String urlStr) {
        // extracts file name from URL
        String fileName = urlStr.substring(urlStr.lastIndexOf("/") + 1);
        System.out.print("File: " + fileName);
        try (ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(urlStr).openStream());
             FileChannel fileChannel = new FileOutputStream(PATH + fileName).getChannel()) {

            fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);

            System.out.println(" downloaded!");
        } catch (MalformedURLException e) {
            System.out.println("MalformedURLException: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Cannot create file: " + PATH + fileName);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }

    private static void downloadFiles(String[] urlArray) {
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        CountDownLatch latch = new CountDownLatch(urlArray.length);

        for (String url : urlArray) {
            executorService.submit(() -> {
                // extracts file name from URL
                String fileName = url.substring(url.lastIndexOf("/") + 1);
                System.out.println("File: " + fileName);
                try (ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(url).openStream());
                     FileChannel fileChannel = new FileOutputStream(PATH + fileName).getChannel()) {

                    fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
                    latch.countDown();
                } catch (MalformedURLException e) {
                    System.out.println("MalformedURLException: " + e.getMessage());
                } catch (FileNotFoundException e) {
                    System.out.println("Cannot create file: " + PATH + fileName);
                } catch (IOException e) {
                    System.out.println("IOException: " + e.getMessage());
                }
            });
        }
        try {
            latch.await();
            System.out.println("DONE!");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException: " + e.getMessage());
        } finally {
            executorService.shutdown();
        }
    }
}