SELECT mhs."NM_MHS", COUNT(mhs."NIM") AS "JML_MHS" 
FROM mahasiswa mhs
WHERE mhs."NM_MHS" LIKE '%Ratna%'
GROUP BY mhs."NM_MHS"