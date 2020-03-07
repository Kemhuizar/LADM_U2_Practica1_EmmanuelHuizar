package mx.edu.ittepic.ladm_u2_practica1_emmanuelhuizar

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View
import java.util.Random

class Lienzo(p:MainActivity) : View(p){
    // se requiere p para que view sepa cual activity va a trabajar
    var puntero = p
    var r = Random()
    //SOL
    var circulo = FiguraGeometrica(800, 250, 150)
    //PISO
    var cuadrado = FiguraGeometrica(0,1650, 1080, 600)
    //CASA
    var rectangulo = FiguraGeometrica(380, 1380, 600, 350)
    var rectangulo3 = FiguraGeometrica(650, 1550, 110, 180)
    var circulo3 = FiguraGeometrica(510, 1480, 50)
    var circulo6 = FiguraGeometrica(740, 1650, 10)
    //ARBOL
    var rectangulo4 = FiguraGeometrica(110, 1440, 110, 210)
    var circulo4 = FiguraGeometrica(160, 1150, 120)
    var circulo5 = FiguraGeometrica(160, 1350, 140)
    //nuve
    var circulo37 = FiguraGeometrica(160, 520, 120)
    var circulo38 = FiguraGeometrica(325, 400, 120)
    var circulo39 = FiguraGeometrica(500, 500, 120)
    var circulo40 = FiguraGeometrica(355, 600, 110)
    //NIEVE
    var circulo2 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo10 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo11 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo12 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo13 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo14 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo15 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo16 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo17 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo18 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo19 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo20 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo21 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo22 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo23 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo24 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo25 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo26 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo27 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo28 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo29 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo30 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo31 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo32 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo33 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo34 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)
    var circulo35 = FiguraGeometrica(r.nextInt(1050), r.nextInt(5000)*-1, 40)




    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        var path =  Path()

        canvas.drawColor(Color.rgb(103,249,227))

        //Dibujando un círculo rojo con contorno blanco
        paint.color = Color.RED
        circulo.pintar(canvas, paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.YELLOW
        paint.strokeWidth = 10f
        circulo.pintar(canvas, paint)

        //Dibujando un cuadrado VERDE Contorno AZUL
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(114,249,103)
        cuadrado.pintar(canvas, paint)

        //Dibujando el rectangulo
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(120,80,30)
        rectangulo.pintar(canvas, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        rectangulo3.pintar(canvas, paint)

        //Triangulo
        paint.style = Paint.Style.FILL
        paint.color=Color.rgb(64,57,41)

        path.moveTo(680f, 1100f)
        path.lineTo(1065f, 1380f)
        path.lineTo(295f, 1380f)
        canvas.drawPath(path,paint)

        //--------------ARBOL
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(95,63,6)
        rectangulo4.pintar(canvas, paint)

        paint.color = Color.rgb(22,111,5)
        circulo4.pintar(canvas, paint)
        circulo5.pintar(canvas, paint)

        //Nuve
        paint.color = Color.WHITE
        circulo39.pintar(canvas, paint)
        circulo37.pintar(canvas, paint)
        circulo38.pintar(canvas, paint)
        circulo40.pintar(canvas, paint)

        paint.color = Color.WHITE
        circulo3.pintar(canvas, paint)

        paint.color = Color.BLACK
        circulo6.pintar(canvas, paint)

        //Dibujando 2do ciculo
        paint.color = Color.WHITE
        circulo2.pintar(canvas, paint)
        circulo10.pintar(canvas, paint)
        circulo11.pintar(canvas, paint)
        circulo12.pintar(canvas, paint)
        circulo13.pintar(canvas, paint)
        circulo14.pintar(canvas, paint)
        circulo15.pintar(canvas, paint)
        circulo16.pintar(canvas, paint)
        circulo17.pintar(canvas, paint)
        circulo18.pintar(canvas, paint)
        circulo19.pintar(canvas, paint)
        circulo20.pintar(canvas, paint)
        circulo21.pintar(canvas, paint)
        circulo22.pintar(canvas, paint)
        circulo23.pintar(canvas, paint)
        circulo24.pintar(canvas, paint)
        circulo25.pintar(canvas, paint)
        circulo26.pintar(canvas, paint)
        circulo27.pintar(canvas, paint)
        circulo28.pintar(canvas, paint)
        circulo29.pintar(canvas, paint)
        circulo30.pintar(canvas, paint)
        circulo31.pintar(canvas, paint)
        circulo32.pintar(canvas, paint)
        circulo33.pintar(canvas, paint)
        circulo34.pintar(canvas, paint)
        circulo35.pintar(canvas, paint)

    }

    fun animarCirculo() {

        circulo2.rebote(height)
        circulo10.rebote(height)
        circulo11.rebote(height)
        circulo12.rebote(height)
        circulo13.rebote(height)
        circulo14.rebote(height)
        circulo15.rebote(height)
        circulo16.rebote(height)
        circulo17.rebote(height)
        circulo18.rebote(height)
        circulo19.rebote(height)
        circulo20.rebote(height)
        circulo21.rebote(height)
        circulo22.rebote(height)
        circulo23.rebote(height)
        circulo24.rebote(height)
        circulo25.rebote(height)
        circulo26.rebote(height)
        circulo27.rebote(height)
        circulo28.rebote(height)
        circulo29.rebote(height)
        circulo30.rebote(height)
        circulo31.rebote(height)
        circulo32.rebote(height)
        circulo33.rebote(height)
        circulo34.rebote(height)
        circulo35.rebote(height)
        invalidate()
    }
}