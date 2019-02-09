package unitec.org.elementosandroid

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true) //Le decimos que deseamos ignorar todas las demas propiedades que existen y solo mostrar las que solicitamos
class Estacion {

    var temp_c:String?=null

}