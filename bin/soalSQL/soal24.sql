CREATE VIEW view_no24 AS

SELECT j."NM_JURUSAN", f."NM_FAKULTAS", COUNT(mhs."NIM") AS "JML_MHS" 
FROM jurusan j
LEFT JOIN mahasiswa mhs
ON j."KD_JURUSAN" = mhs."KD_JURUSAN"
LEFT JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
GROUP BY j."NM_JURUSAN", f."NM_FAKULTAS"

SELECT * FROM view_no23 WHERE "JML_MHS" = (SELECT MIN("JML_MHS") FROM view_no23)