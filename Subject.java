package IMC;

/**

 */
interface Subject {
    public void registroObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers(double peso, double altura);
}
