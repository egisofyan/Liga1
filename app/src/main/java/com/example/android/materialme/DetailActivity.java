/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.materialme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/***
 * Detail Activity that is launched when a list item is clicked.
 * It shows more info on the sport.
 */
public class DetailActivity extends AppCompatActivity {

    /**
     * Initializes the activity, filling in the data from the Intent.
     *
     * @param savedInstanceState Contains information about the saved state
     *                           of the activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize the views.
        TextView sportsTitle = findViewById(R.id.titleDetail);
        TextView sportDetail = findViewById(R.id.subTitleDetail);
        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

        // Set the text from the Intent extra.
        sportsTitle.setText(getIntent().getStringExtra("title"));

        // Load the image using the Glide library and the Intent extra.
        Glide.with(this).load(getIntent().getIntExtra("image_resource",0))
                .into(sportsImage);

        String judul =sportsTitle.getText().toString();

        switch (judul) {
            case "Arema FC":
                sportDetail.setText("Arema FC (dahulu bernama Arema Cronus) , atau biasa disebut dan dikenal sebagai Arema Malang, adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia. Arema didirikan pada tanggal 11 Agustus 1987, Arema mempunyai julukan \"Singo Edan\". Dalam Liga 1, Arema bermarkas di Stadion Kanjuruhan, Kabupaten Malang dan Stadion Gajayana, Kota Malang. Arema adalah tim sekota dari Persema Malang, Persekam Metro, dan Malang United ");

                break;
            case "Bali United":
                sportDetail.setText("Bali United F.C. (sebelumnya bernama Persisam Putra Samarinda) merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali, Indonesia. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda (Persisam) yang merupakan eks tim Perserikatan dan Putra Samarinda dari Galatama. Pada 15 Februari 2015, Putra Samarinda diambil alih pengusaha asal Indonesia, Pieter Tanuri, setelah sebelumnya mengalami kesulitan finansial hingga akhirnya berpindah kandang ke Bali dan mengubah namanya menjadi Bali United F.C");
                break;
            case "Barito Putera" :
                sportDetail.setText("PS Barito Putera (singkatan dari: Persatuan Sepak Bola Barito Putera) adalah klub sepak bola Indonesia berbasis di Kota Banjarmasin, Kalimantan Selatan, yang bermain di Liga 1 sejak musim 2013.\n" +
                        "\n" +
                        "Barito Putera didirikan pada tahun 1988 dan bermarkas di Stadion 17 Mei Banjarmasin.\n" +
                        "\n" +
                        "Klub sekota Barito Putera adalah Peseban Banjarmasin yang berlaga di Liga 3 dan klub kota tetangga Martapura FC yang berlaga di Liga 2.");
                break;
            case "Bhayangkara FC":
                sportDetail.setText("Bhayangkara Football Club adalah sebuah tim sepak bola Indonesia yang dimiliki oleh Polri yang berbasis di Jakarta. Klub ini bermain di Liga 1. Klub ini juga memegang rekor sebagai klub dengan pergantian nama terbanyak di Indonesia, semuanya karena dualisme yang pernah terjadi antara klub ini dengan klub Persebaya Surabaya pada rentang waktu 2010 sampai 2016.[8]");
                break;
            case "Borneo FC":
                sportDetail.setText("Borneo F.C. adalah klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur, Indonesia. Pada awal berdirinya klub ini bermain di Divisi Utama Liga Indonesia 2014 setelah mengakuisisi klub Perseba Super Bangkalan pada tanggal 7 Maret 2014, menggantikan Persisam Samarinda sebagai Klub asal samarinda, Kalimantan Timur yang berkompetisi di liga teratas di Indonesia. Pada 2015, mereka berlaga di Indonesia Super League berstatus sebagai klub promosi setelah berhasil keluar sebagai juara Divisi Utama Liga Indonesia 2014 setelah mengalahkan Persiwa Wamena di partai final.");
                break;
            case "Madura United":
                sportDetail.setText("Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. Pemilik Pelita Bandung Raya, Ari D. Sutedi akhirnya menjual klubnya ke Achsanul Qosasi, dan kemudian bertransformasi menjadi Madura United FC. Kini, Madura United menjelma menjadi salah satu klub terkuat di liga utama Indonesia.");
                break;
            case "Persebaya Surabaya":
                sportDetail.setText("Persebaya Surabaya yang sempat mengubah namanya menjadi Persebaya 1927,[3] adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama asalnya adalah Soerabajasche Indische Voetbal Bond (SIVB) dan sudah malang melintang dikancah sepak bola Indonesia. Sempat di bekukan oleh PSSI dan disahkan kembali oleh PSSI sebagai anggota di Kongres Tahunan PSSI Bandung pada tanggal 8 Januari 2017.");
                break;
            case "Persela Lamongan":
                sportDetail.setText("Persatuan Sepak Bola Lamongan (biasa disingkat: Persela) dan mempunyai julukan Laskar Joko Tingkir adalah sebuah klub sepak bola Indonesia yang bermarkas di Lamongan, Jawa Timur. Persela dikelola oleh PT. Persela Jaya.");
                break;
            case "Persib Bandung":
                sportDetail.setText("Persib Bandung (Persatuan Sepak Bola Indonesia Bandung) (Aksara Sunda Baku: ᮕᮦᮁᮞᮤᮘ᮪ ᮘᮔ᮪ᮓᮥᮀ, Pérsib Bandung) adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dan apparel jersey yang terbaru adalah Sportama.\n" +
                        "\n" +
                        "Sebagai tim yang dikenal baik, Persib Bandung juga sering menjadi penyumbang pemain ke tim nasional baik junior maupun senior. Sederet nama seperti Ade Dana, Emen Suwarman, Aang Witarsa, Max Timisela, Risnandar Soendoro, Nandar Iskandar, Adeng Hudaya, Herry Kiswanto, Ajat Sudrajat, Yusuf Bachtiar, Dadang Kurnia, Robby Darwis, Budiman, Nur'alim, Yaris Riyadi hingga generasi Erik Setiawan, Eka Ramdani, Gian Zola, dan Febri Hariyadi, merupakan sebagian pemain timnas hasil binaan Persib Bandung.");
                break;
            case "Persija Jakarta":
                sportDetail.setText("Persija (singkatan dari Persatuan Sepak Bola Indonesia Jakarta) adalah klub sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija merupakan salah satu klub sepakbola paling sukses di sejarah sepakbola Indonesia dengan torehan 2 kali juara liga domestik dan 9 kali juara turnamen perserikatan hingga sejauh ini.");
                break;
            case "Persik Kediri":
                sportDetail.setText("Persatuan Sepak Bola Indonesia Kediri (disingkat Persik) merupakan klub sepak bola Indonesia yang berbasis di Kota Kediri, Jawa Timur. Tim ini mempunyai kandang di Stadion Brawijaya dan dijuluki Macan Putih. Persik Kediri mulai bermain di Divisi Utama Liga Indonesia pada tahun 2003. Klub ini didirikan Pada tanggal 19 Mei 1950.");
                break;
            case "Persipura Jayapura":
                sportDetail.setText("Persatuan Sepak bola Indonesia Jayapura (disingkat Persipura Jayapura) adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013[1]. Di era Perserikatan, prestasi Persipura adalah runner-up Divisi Utama (1980) dan dua kali juara Divisi I (1979 dan 1993). Persipura juga dikenal sebagai klub bola yang melahirkan pemain lokal yang berkualitas internasional seperti Boaz Solossa, Ardiles Rumbiak, Chris Yarangga, Christian Warobay, Erol Iba, Gerald Pangkali, Jack Komboy, Yohanes Auri, Stevie Bonsapia, Titus Bonai, Jendri Pitoy, Eduard Ivakdalam, Ricardo Salampessy, Patrich Wanggai dan Osvaldo Haay");
                break;
            case "Persiraja Banda Aceh":
                sportDetail.setText("Persatuan Sepak bola Indonesia Kutaraja Banda Aceh, atau sering disingkat Persiraja Banda Aceh adalah sebuah klub sepak bola Indonesia asal Kota Banda Aceh, ibu kota Provinsi Aceh. Kutaraja merupakan nama lama Kota Banda Aceh. Klub ini didirikan pada tanggal 28 Juli 1957.\n" +
                        "\n" +
                        "Pada musim 2010/2011 Persiraja bermain di Divisi Utama Liga Indonesia sukses Promosi Ke Level Tertinggi Sepak Bola Indonesia. Karena Terjadinya Dualisme Kompetisi di Indonesia, Persiraja Banda Aceh Memutuskan Mengikuti Kompetisi Resmi dari PSSI yaitu Indonesian Premier League pada Musim 2011/2012.");
                break;
            case "Persita Tangerang":
                sportDetail.setText("Persatuan Sepak bola Indonesia Tangerang (disingkat Persita atau Persita Tangerang) adalah sebuah klub sepak bola Indonesia yang bermarkas di Tangerang. Tim berjuluk Pendekar Cisadane identik dengan kostum ungunya.\n" +
                        "\n" +
                        "Pada kompetisi Divisi Utama Liga Indonesia 2015, markas Persita adalah Stadion Maulana Yusuf di Serang. Kemudian pada musim 2018, Persita menggunakan Stadion Sport Center Dasana Indah Kab. Tangerang.[1]");
                break;
            case "PS Tira":
                sportDetail.setText("Persikabo (singkatan dari: Persatuan Sepak bola Indonesia Kabupaten Bogor) adalah sebuah klub sepak bola Indonesia yang dahulu bermarkas di Kabupaten Bogor. Pada tahun 2018 Persikabo berkompetisi di Liga 3 Jawa Barat. Awal tahun 2019 Persikabo melakukan merger dengan klub Liga 1 yaitu PS TIRA yang kemudian nama kedua klub tersebut digabungkan menjadi PS TIRA Persikabo.[2]");
                break;
            case "PSIS Semarang":
                sportDetail.setText("Persatuan Sepak Bola Indonesia Semarang atau PSIS Semarang (bahasa Jawa: ꦥꦼꦂꦱꦠꦸꦮꦤ꧀\u200Bꦱꦼꦥꦏ꧀\u200Bꦧꦺꦴꦭ\u200Bꦆꦤ꧀ꦢꦺꦴꦤꦺꦱꦶꦪ\u200Bꦱꦼꦩꦫꦁ, translit. Persatuan Sepak Bola Indonésia Semarang) adalah klub sepak bola yang bermarkas di kota Semarang, Indonesia dengan tempat berlatih dan bertanding di Stadion Jatidiri Semarang. Julukan klub ini adalah \"Laskar Mahesa Jenar\". PSIS Semarang adalah klub pertama di Liga Indonesia yang pernah menjadi juara Divisi Utama (1999) dan kemudian terdegradasi ke divisi I pada musim berikutnya (2000). PSIS kemudian berhasil menjuarai kompetisi Divisi I nasional (2001), dan berhak berlaga kembali di kompetisi Divisi Utama Liga Indonesia. PSIS Semarang juga tercatat sebagai klub ketiga yang pernah menjuarai Liga Perserikatan dan Divisi Utama Liga Indonesia, setelah Persib Bandung dan Persebaya Surabaya.");
                break;
            case "PSM Makasar":
                sportDetail.setText("Persatuan Sepak bola Makassar (disingkat PSM Makassar) adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasukan Ramang atau Juku Eja. PSM Makassar saat ini bermain di Shopee Liga 1, setelah sebelumnya pernah bermain di Liga Primer Indonesia. PSM Makassar merupakan salah satu tim terkuat di Indonesia dan telah mewakili Indonesia dalam Liga Champions Asia sebanyak tiga kali. PSM Makassar merupakan tim dengan catatan prestasi paling stabil di pentas Liga Indonesia, dengan sekali menjadi juara, delapan kali runner up, dan hanya sekali gagal masuk putaran final. PSM Makassar adalah tim tertua di Indonesia. Pada tahun 2014, PSM Makassar kembali ke Liga Super Indonesia setelah lolos play-off unifikasi liga PSSI.");
                break;
            case "PSS Sleman":
                sportDetail.setText("Perserikatan Sepakbola Sleman (biasa disingkat: PSS) (bahasa Jawa: ꦥꦺꦂꦱꦺꦫꦶꦏꦠꦤ꧀\u200Bꦱꦺꦥꦏ꧀\u200Bꦧꦺꦴꦭ\u200Bꦱ꧀ꦭꦺꦩꦤ꧀, translit. Perserikatan Sepakbola Sleman) merupakan sebuah klub sepak bola yang berbasis di Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia. Klub yang didirikan pada 20 Mei 1976 ini merupakan salah satu klub sepak bola yang disegani di Indonesia dan memiliki julukan sebagai tim Elang Jawa atau Elja. Klub ini juga sering disebut dengan julukan Laskar Sembada. Mereka bermain di Liga 1 dalam sebuah kompetisi sepak bola Indonesia, Liga Indonesia. Prestasi tertingginya dalam kompetisi kasta tertinggi Liga Indonesia adalah dua tahun berturut-turut menempati empat besar pada Divisi Utama Liga Indonesia 2003 dan Divisi Utama Liga Indonesia 2004. Stadion utama mereka adalah Stadion Maguwoharjo, dan menggunakan Stadion Tridadi sebagai stadion kedua. PSS juga memiliki suporter yang sangat militan dan dikenal sampai ke luar negeri yakni Slemania yang beraliran Mania dan Brigata Curva Sud (BCS x PSS) yang beraliran Ultras.");
                break;



        }
    }
}
