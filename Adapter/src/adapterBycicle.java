public class adapterBycicle implements vehicule{
    private bycicle bycicle = new bycicle();
    adapterBycicle(bycicle bycicle){
        this.bycicle = bycicle;
    }
    @Override
    public void accelerating() {
        bycicle.running();
    }

    @Override
    public void stopping() {
         bycicle.stopping();
    }

    @Override
    public void Pipe() {
        bycicle.trintrin();
    }
}
