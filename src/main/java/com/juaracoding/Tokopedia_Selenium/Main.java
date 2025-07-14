package com.juaracoding.Tokopedia_Selenium;

import org.testng.TestNG;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Mendapatkan direktori proyek root dari sistem
        String rootProject = System.getProperty("user.dir");

        // Membuat instance dari TestNG
        TestNG runner = new TestNG();

        // Mengatur direktori output untuk hasil pengujian
        // Output akan disimpan dengan format waktu saat ini untuk membedakan hasil pengujian
        runner.setOutputDirectory(rootProject + "\\output-testng\\selenium\\" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss")));

        // Membuat daftar file suite pengujian
        List<String> suitefiles = new ArrayList<String>();

        // Menambahkan file-file suite pengujian ke dalam daftar
        // File-file ini berisi konfigurasi untuk suite pengujian
        suitefiles.add(rootProject + "\\Test_Selenium.xml");

        // Mengatur suite pengujian yang akan dijalankan
        runner.setTestSuites(suitefiles);

        // Menjalankan pengujian
        runner.run();
    }
}