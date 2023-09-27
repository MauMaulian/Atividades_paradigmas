public class ControlePS5 {
    //Classe Cliente(Client)
        private SensorPS5 sensorAQueSeConecta;

        public void Conectar(SensorPS5 sensor){
            this.sensorAQueSeConecta = sensor;
            sensorAQueSeConecta.conectarPS5();
        }

}
