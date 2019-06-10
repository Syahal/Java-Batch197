SELECT mhs."NIM", mhs."NM_MHS", j."NM_JURUSAN", f."NM_FAKULTAS", mk."NM_MK", mk."SKS", kd."NILAI"
FROM mahasiswa mhs
INNER JOIN kelasdetail kd ON kd."NIM" = mhs."NIM"
INNER JOIN kelas kls ON kls."KD_KELAS" = kd."KD_KELAS"
INNER JOIN matakuliah mk ON mk."KD_MK" = kls."KD_MK"
INNER JOIN jurusan j ON j."KD_JURUSAN" = mk."KD_JURUSAN"
INNER JOIN fakultas f ON f."KD_FAKULTAS" = j."KD_FAKULTAS"