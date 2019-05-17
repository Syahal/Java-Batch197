SELECT mhs."NM_MHS", COUNT(mhs."NIM") AS "JML_MHS" 
FROM mahasiswa mhs
WHERE mhs."NM_MHS"::text ~~ '%Desi%'::text
GROUP BY mhs."NM_MHS"