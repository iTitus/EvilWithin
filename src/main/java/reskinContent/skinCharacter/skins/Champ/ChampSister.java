package reskinContent.skinCharacter.skins.Champ;

import champ.ChampChar;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.helpers.ImageMaster;
import reskinContent.reskinContent;
import reskinContent.skinCharacter.AbstractSkin;

public class ChampSister extends AbstractSkin {

    public ChampSister() {
        this.portraitStatic_IMG = ImageMaster.loadImage(reskinContent.assetPath("img/ChampMod/Chan-P/portrait_waifu.png"));
        this.portraitAnimation_IMG = ImageMaster.loadImage(reskinContent.assetPath("img/ChampMod/Chan-P/portrait_waifu2.png"));

        this.NAME = CardCrawlGame.languagePack.getUIString("reskinContent:ReSkinChamp").TEXT[0];
        this.DESCRIPTION = CardCrawlGame.languagePack.getCharacterString(ChampChar.ID).TEXT[0];

        this.portraitAtlasPath = reskinContent.assetPath("img/ChampMod/Chan-P/animation/GuardianChan_portrait");

        this.SHOULDER1 = "reskinContent/img/ChampMod/Chan-P/shoulder2.png";
        this.SHOULDER2 = "reskinContent/img/ChampMod/Chan-P/shoulder.png";
        this.CORPSE =  "reskinContent/img/ChampMod/Chan-P/corpse.png";
        this.atlasURL = "reskinContent/img/ChampMod/Chan-P/animation/TheChampPlayer.atlas";
        this.jsonURL = "reskinContent/img/ChampMod/Chan-P/animation/TheChampPlayer.json";
        this.renderscale = 2.5f;
    }
    @Override
    public void InitializeStaticPortraitVar() {

    }

}


