package de.kamtsports.game.players.Actions;

import de.kamtsports.game.board.fields.Field;
import de.kamtsports.game.players.Player;


public abstract class Action {

    final protected Player actor;
    final protected Field field;


    public Action(Player actor, Field field) {
        this.actor = actor;
        this.field = field;
    }

    public Action(Player actor) {
        this(actor,null);
    }

    public Action(Field field) {
        this(null,field);
    }

    //TODO implement doAction and invocation of it
    public abstract void doAction();


}
