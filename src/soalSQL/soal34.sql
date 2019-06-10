CREATE VIEW view_no34 AS

SELECT mhs."NIM", mhs."NM_MHS", j."NM_JURUSAN", f."NM_FAKULTAS", mk."NM_MK", mk."SKS", kd."NILAI", bn."BOBOT", kd."STATUS"
FROM mahasiswa mhs
INNER JOIN jurusan j ON mhs."KD_JURUSAN" = j."KD_JURUSAN"
INNER JOIN fakultas f ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
INNER JOIN matakuliah mk ON j."KD_JURUSAN" = mk."KD_JURUSAN"
INNER JOIN kelasdetail kd ON mhs."NIM" = kd."NIM"
INNER JOIN bobotnilai bn ON kd."NILAI" = bn."NILAI"
WHERE kd."STATUS" = 'LULUS';

SELECT * FROM view_no34