# Programacion-Funcional
Este codigo aplica los principios de la programacion funcional al codigo que dibuja figuras geometricas
Caracteristicas:
  - IDraw es la interfaz con el metodo base draw()
  - Cada figura implementa la interfaz y su metodo
  - MainFrame tiene dos formas diferentes de aplicar la programacion funcional, el triangulo dibuja usando una funcion lambda de forma directa,
mientras que circulo y cuadrado lo hacen de forma mas simplificadas, dentro de MainFrame se tiene un metodo llamado drawFunction que tiene como
parametro IDraw, en cada dibujo se hace la implementacion usando una referencia el metodo draw
