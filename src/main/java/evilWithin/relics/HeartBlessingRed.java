package evilWithin.relics;

import basemod.abstracts.CustomRelic;
import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.actions.common.ApplyPowerAction;
import com.megacrit.cardcrawl.actions.common.RelicAboveCreatureAction;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.StrengthPower;
import com.megacrit.cardcrawl.rooms.MonsterRoomBoss;
import evilWithin.EvilWithinMod;

public class HeartBlessingRed extends CustomRelic {

    public static final String ID = EvilWithinMod.makeID("HeartBlessingRed");
    private static final Texture IMG = new Texture(EvilWithinMod.assetPath("images/relics/HeartBlessingRed.png"));
    private static final Texture OUTLINE = new Texture(EvilWithinMod.assetPath("images/relics/HeartBlessingRed.png"));

    public HeartBlessingRed() {
        super(ID, IMG, OUTLINE, RelicTier.SPECIAL, LandingSound.FLAT);
    }

    @Override
    public String getUpdatedDescription() {
        return DESCRIPTIONS[0];
    }

    public void atBattleStart() {
        this.flash();
        this.addToTop(new ApplyPowerAction(AbstractDungeon.player, AbstractDungeon.player, new StrengthPower(AbstractDungeon.player, 1), 1));
        this.addToTop(new RelicAboveCreatureAction(AbstractDungeon.player, this));
    }

}