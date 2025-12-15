/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjdungeon;

/**
 *
 * @author manuel.stenico
 */
public class Necromante extends Nemici{
    int nMorti;

    public Necromante( String nome, int[] pos, int atk, int def, int hp, int maxHp, double range,boolean isBoss) {
        super( nome, pos, atk, def, hp, maxHp, range,isBoss);
        nMorti = 0;
    }
    
    

    public void InvocazioneMorti(){
        setHp(getHp()-8);
        if(true==super.isVivo()){
            nMorti++;
            setAtk(getAtk()+nMorti*2);
        }
    }
    
    public void InvocazioneOrdaMorti(){
        setHp(getHp()-33);
        if(true==super.isVivo()){
            nMorti+=5;
            setAtk(getAtk()+nMorti*3);
        }
    }
    
    
    
    

    @Override
    public String toString() {
        return "Necromante{" + "nMorti=" + nMorti + '}';
    }
}

