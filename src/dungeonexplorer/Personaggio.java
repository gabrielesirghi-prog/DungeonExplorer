package dungeonexplorer;
public class Personaggio {
    private String nome;
    private int hp;
    private int atk;
    private int def;
    private double range;
    private int[] pos;

    public Personaggio(String nome, int hp, int atk, int def, double range, int[] pos) {
        this.nome = nome;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.range = range;
        this.pos = pos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getAtk() {
        return atk;
    }
    public void setAtk(int atk) {
        this.atk = atk;
    }
    public int getDef() {
        return def;
    }
    public void setDef(int def) {
        this.def = def;
    }
    public double getRange() {
        return range;
    }
    public void setRange(double range) {
        this.range = range;
    }
    public int[] getPos() {
        return pos;
    }
    public void setPos(int[] pos) {
        this.pos = pos;
    }
    @Override
    public String toString() {
        return "Personaggio{" + "nome=" + nome + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", range=" + range + ", pos=" + pos + '}';
    }
    public int attacco(Personaggio nemico){
        return 0;
    }
    public int attacco(Personaggio nemico, Arma arma){
        return 0;
    }
    private boolean isVivo(){
        boolean ris = false;
        if(hp > 0){
            ris = true;
        }
        return ris;
    }
    public boolean subisciDanno(int danno){
        hp -= danno;
        boolean ris = false;
        if(isVivo()){
            ris = true;
        }
        return ris;
    }
    public void movimento(int x, int y){
        
    }
    
   
}
