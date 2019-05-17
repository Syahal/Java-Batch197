SELECT mhs."NIM", mhs."NM_MHS", j."NM_JURUSAN", f."NM_FAKULTAS" 
FROM mahasiswa mhs
INNER JOIN jurusan j
ON mhs."KD_JURUSAN" = j."KD_JURUSAN"
INNER JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS" 