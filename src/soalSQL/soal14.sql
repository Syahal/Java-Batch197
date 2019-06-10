SELECT d."NM_DOSEN", mk."NM_MK", j."NM_JURUSAN", f."NM_FAKULTAS", kls."NM_KELAS", r."NM_RUANG"
FROM kelas kls
INNER JOIN dosen d
ON kls."KD_DOSEN" = d."KD_DOSEN"
INNER JOIN matakuliah mk
ON kls."KD_MK" = mk."KD_MK"
INNER JOIN jurusan j
ON mk."KD_JURUSAN" = J."KD_JURUSAN"
INNER JOIN fakultas f
ON j."KD_FAKULTAS" = f."KD_FAKULTAS"
INNER JOIN ruang r
ON kls."KD_RUANG" = r."KD_RUANG";