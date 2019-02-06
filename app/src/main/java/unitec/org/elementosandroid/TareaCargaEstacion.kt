package unitec.org.elementosandroid

import android.content.Context
import android.os.AsyncTask
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate

class TareaCargaEstacion(private var ctx: Context?)
    : AsyncTask<Void,Void,Void>() {

    override fun onPostExecute(result: Void?) {
        //Despues de la gestion de la informacion, generalmente muestra informacion
        super.onPostExecute(result)
    }

    override fun onPreExecute() {
        //Previo a la gestion de la informacion, generalmente recolecta la informacion a usar
        //Por ejemplo un login mas password
        super.onPreExecute()
    }

    //Recibe los datos solicitados y se los pasa al POST
    override fun doInBackground(vararg p0: Void?): Void? {
        try {
            var url ="https://api.weatherlink.com/v1/NoaaExt.json?user=001D0A0040AE&pass=Campitos1973&apiToken=8DA86B5995E94BA3BD3EBD811086F906";


            val restTemplate = RestTemplate()
            restTemplate.messageConverters.add(MappingJackson2HttpMessageConverter())


            val maper = ObjectMapper()
            //  usuarios = maper.readValue(estring, object : TypeReference<ArrayList<Usuario>>() {})

            val respuesta = restTemplate.getForObject(url, String::class.java)

            // estacion = maper.readValue(respuesta, Estatus::class.java)


            println("DESPUES DE REST");
        } catch (t: Throwable) {

        }
        return null

    }

}