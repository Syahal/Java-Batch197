SELECT mhs."ALAMAT", COUNT(mhs."NIM") AS "JML_MHS" 
FROM mahasiswa mhs
GROUP BY mhs."ALAMAT"
