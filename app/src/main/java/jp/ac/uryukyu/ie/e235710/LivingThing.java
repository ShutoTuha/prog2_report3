package jp.ac.uryukyu.ie.e235710;

/**
 * LivingThingクラス。
 *  String name; //キャラの名前　キャラ＝キャラクター
 *  int hitPoint; //キャラのHP
 *  int attack; //キャラの攻撃力
 *  boolean dead; //キャラの生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String _name, int maximumHP, int _attack){
        this.name = _name;
        this.hitPoint = maximumHP;
        this.attack = _attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

/**
 * キャラの名前を取得
 * @return name 
 */
    public String getName(){
        return name;
    }

/**
 * キャラのHPを取得
 * @return hitPoint
 */
    public int getHitPoint(){
        return hitPoint;
    }

/**
* キャラの攻撃力を取得
* @return attack
*/
    public int getAttack(){
        return attack;
    }

/**
* キャラの生存状態を取得
* true = 死亡
* @return dead
*/
    public boolean isDead(){
        return dead;
    }

/**
 * キャラの名前を変更できる
 * @param name
 */
    public void setName(String name) {
        this.name = name;
    }

/**
* キャラのHPを変更できる
* @param hitPoint
*/
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

/**
* キャラの攻撃力を変更できる
* @param attack
*/
    public void setAttack(int attack){
        this.attack = attack;
    }

/**
* キャラの生存状態を変更できる
* @param dead
*/
    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void attack(LivingThing opponent){
        if(!(this.dead)){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
