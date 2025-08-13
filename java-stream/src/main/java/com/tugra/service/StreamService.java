package com.tugra.service;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class StreamService {

    public static void main(String[] args) {

        List<String> streamList = new ArrayList<>();

        streamList.add("Tugra");
        streamList.add("Mehmet");
        streamList.add("Ahmet");
        streamList.add("Zeynep");
        streamList.add("Esma");
        streamList.add("Arzu");
        streamList.add("Arzu");
        streamList.add("Arzu");
        streamList.add("Arzu");

        streamList.forEach(System.out::println); // Bütün listeyi yazdırır.

        System.out.println("----------------------------------------------");

        List<String> distinctListe = streamList.stream()
                        .distinct()
                                .collect(Collectors.toList());

        distinctListe.stream()
                        .forEach(System.out::println); // Tekrar eden isimleri filtreler ve yazdırır.


        System.out.println("----------------------------------------------");

        streamList.stream().filter(s -> s.startsWith("M")).forEach(System.out::println); // M ile başlayanları filtreler ve yazdırır.

        System.out.println("----------------------------------------------");

        streamList.stream()
                .filter(s -> s.startsWith("M"))
                .map(String::toUpperCase)
                .forEach(System.out::println); // M ile başlayanları büyük harfe çevirir ve yazdırır.

        System.out.println("----------------------------------------------");

        Integer adet = Math.toIntExact(streamList.stream()
                .count());

        System.out.println("Eleman Sayisi : " + adet); // Liste içindeki eleman sayısını yazdırır.


        System.out.println("---------------------------------------------");

        Integer listeIcındekiElemanlarSayisi = streamList.size();

        System.out.println("Liste içindeki eleman sayısı: " + listeIcındekiElemanlarSayisi); // Liste içindeki eleman sayısını yazdırır.

        System.out.println("----------------------------------------------");

        streamList.stream()
                .map(s -> s + "k")
                .forEach(System.out::println); // Her ismin sonuna "k" ekler ve yazdırır.


        System.out.println("----------------------------------------------");


        streamList.stream()
                .map(String::length)
                .forEach(System.out::println); // İsimlerin uzunluklarını yazdırır.


        System.out.println("----------------------------------------------");

        List<String> list = streamList.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(list); // A ile başlayan isimleri büyük harfe çevirir ve liste olarak saklar.

        System.out.println("----------------------------------------------");

        List<String> liste = streamList.stream()
                .sorted()
                .collect(Collectors.toList());

        liste.stream()
                .forEach(System.out::println); // Listeyi alfabetik sıraya göre sıralar ve yazdırır.


        System.out.println("----------------------------------------------");


        List<Integer> sayiListesi = new ArrayList<>();

        sayiListesi.add(3);
        sayiListesi.add(10);
        sayiListesi.add(98);
        sayiListesi.add(75);
        sayiListesi.add(32);

        sayiListesi.forEach(System.out::println); // Bütün sayıları yazdırır.

        System.out.println("----------------------------------------------");

        sayiListesi.stream()
                .filter(s -> s > 50)
                .map(s -> s * 2)
                .forEach(System.out::println); // 50'den büyük sayıları filtreler, her birini 2 ile çarpar ve yazdırır.


        System.out.println("----------------------------------------------");

        sayiListesi.stream()
                .sorted()
                .forEach(System.out::println); // Sayıları küçükten büyüğe sıralar ve yazdırır.


        System.out.println("----------------------------------------------");

        Integer toplam = sayiListesi.stream()
                .reduce(0, Integer::sum); // Sayıların toplamını hesaplar.

        System.out.println("Listenin içindeki sayıların toplamı: " + toplam); // Toplamı yazdırır.


        System.out.println("----------------------------------------------");

        Integer toplamFarkliVersion = sayiListesi.stream()
                                      .mapToInt(Integer::intValue)
                                      .sum(); // Farklı bir versiyon ile sayıların toplamını hesaplar.

        System.out.println("Listenin içindeki sayıların toplamı (farklı versiyon): " + toplamFarkliVersion); // Farklı versiyon ile toplamı yazdırır.

    }

}
