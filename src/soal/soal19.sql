SELECT r."NM_RUANG", r."KAPASITAS"
FROM ruang r
WHERE "KAPASITAS" = (SELECT MAX("KAPASITAS")FROM ruang);