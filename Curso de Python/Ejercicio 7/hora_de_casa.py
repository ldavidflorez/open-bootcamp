import time

HORA_DE_CASA = 19  # 7 p.m.

ahora = time.localtime()
hora = ahora.tm_hour
minuto = ahora.tm_min

if hora > HORA_DE_CASA:
    print("Es hora de ir a casa")
elif hora == HORA_DE_CASA and minuto > 0:
    print("Es hora de ir a casa")
else:
    minutos_restantes = HORA_DE_CASA * 60 - hora * 60 - minuto
    print(
        f"No es hora de ir a casa, te restan {minutos_restantes} minutos")
