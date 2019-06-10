SELECT mhs."JK", COUNT(mhs."NIM") AS "JML_MHS" 
FROM mahasiswa mhs
GROUP BY mhs."JK"
