 SELECT j."NM_JURUSAN",
    j."KD_JURUSAN",
    count(mk."KD_MK") AS "JML_MK"
   FROM jurusan j
     LEFT JOIN matakuliah mk ON j."KD_JURUSAN"::text = mk."KD_JURUSAN"::text
  GROUP BY j."NM_JURUSAN", j."KD_JURUSAN";