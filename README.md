Anggota Kelompok :

Muhammad Iqbal Ridho (2309141)
Andhika Pratama (2301647)
Pramudya Aditama Sudrajat (2310230)
Muhammad Miftah Fadhilah  Al-Ghifari (2308678)

Penjelasan Program APKMGK

Program Asosiasi Pengendalian Kepadatan Manusia di Gerbong Kereta (APKMGK) merupakan program untuk menghitung kepadatan manusia dengan menghitung orang yang masuk ke gerbong tertentu dan program kami juga dapat mengetahui jumlah orang dalam gerbong pada dua interval tertentu.

Notasi Big O

START

READ (M, N)									1

Initialize gerbong as a list of size N with all elements set to 0		1
Initialize penyimpanan_results as an empty list					1

FOR i <- 0 TO N-1 								N
    READ tipe									1
    	IF tipe == 1 THEN							1
        	READ x, y							1
        	IF y > 100 THEN							1
            	WRITE "Jumlah Orang Melebihi Kapasitas!"			1
            	BREAK								1
        	SET gerbong[x-1] TO gerbong[x-1] + y				1

    	ELSE IF tipe == 2 THEN							1
        	READ (A, B, C, D)						1
		IF A > B || C > D THEN
		WRITE "Aktivitas 2 tidak memenuhi aturan karena A > B dan C > D"1
        	Initialize orangBerbeda as an empty set				1

        	FOR j FROM A-1 TO B-1						N
            			ADD j TO orangBerbeda				1
        	FOR j FROM C-1 TO D-1						N
            			ADD j TO orangBerbeda				1

        	totalOrang <- 0							1

        	FOR gerbongIndex IN orangBerbeda				N
            			totalOrang = totalOrang + gerbong[gerbongIndex]	1
        		
		ADD totalOrang TO penyimpanan_results				1
END FOR

FOR result IN penyimpanan_results						N
    WRITE result								1
								

= 1 + 1 + 1 + N(1 + 1 + 1 + 1 + 1 +
  1 + 1 + 1 + 1 + 1 + 1 + (N * 1) +
 (N * 1) + 1 + (N * 1) + 1) + (N * 1)

= 3 + N(13 + 3N) + N

= 3 + 13N + 3N^2 + N
= O(N^2)
