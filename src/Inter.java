public interface Inter {
    void inputValue(int v);
    void inputProc(double p);
    void inputMonth(int m);
    double profit();

    default String copyrights(){
        return "© Розрахунки за кодом Андрія (default-метод)";
    }
}
