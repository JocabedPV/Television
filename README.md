# Asignacion 2.1 - Clases y Metodos

**Estudiante:** Jocabed Peña
**Matrícula:** 2026-0053


## Descripcion

Programa realizado en java junto con Netbeans donde contiene clases con atributos y metodos simulando el funcionamiento basico de un televisor

## Archivos

-Television.java (Clase con los atributos y metodos del televisor)

-Prueba.java (Clase con el main donde tiene 3 ejemplos de television con diferentes acciones)

## Atributos

Atributo  | Tipo     | Descripcion                           |
----------|----------|---------------------------------------|
Marca     | String   | Marca de la television                |                                     
Pulgadas  | int      | Tamaño del televisor                  |
Encendido | boolean | Si la television esta encendida o no   |  
Volumen   | int      | Volumen (0 a 100)                     |
Canal     | int      | Canales de television                 |

## Metodos

Metodo            | Descripcion                                                         |
------------------|----------------------------------------------------------------------
encender()       | Enciende la television                                               |
apagar()         | Apaga la television                                                  |
subirVolumen()   | Sube el volumen de la television, en bloques de 5 (maximo hasta 100) |
bajarVolumen()   | Baja el volumen de la television, en bloques de 5 (minimo hasta 0)   |
cambiarCanal()   | Cambia al canal ingresado                                            |

Cada metodo imprime en consola la accion que realiza. En caso de que la television se encuentre apagada no puede subir ni bajar volumen.

## Ejecucion


Se puede probar a traves del archivo Prueba.java

Ya que el archivo Television.java solo contiende los atributos y metodos

