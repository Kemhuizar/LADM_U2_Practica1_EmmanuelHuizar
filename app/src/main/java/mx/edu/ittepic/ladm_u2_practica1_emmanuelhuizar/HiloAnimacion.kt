package mx.edu.ittepic.ladm_u2_practica1_emmanuelhuizar

class HiloAnimacion (p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()
        var a=false
        var b=0
        if(a==false){
            while (b<=100000000){
                b=b+1
            }
            a=true
        }
        while(a){
            Thread.sleep(10)
            puntero.runOnUiThread {
                puntero.lienzo!!.animarCirculo()
            }
        }
    }
}