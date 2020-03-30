
package evilWithin.patches;

import com.evacipated.cardcrawl.modthespire.lib.*;
import com.megacrit.cardcrawl.core.CardCrawlGame;
import com.megacrit.cardcrawl.core.Settings;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.ui.buttons.ReturnToMenuButton;
import com.megacrit.cardcrawl.unlock.UnlockTracker;
import guardian.patches.GuardianEnum;
import slimebound.SlimeboundMod;


@SpirePatch(
        clz = ReturnToMenuButton.class,
        method = "appear",
        paramtypez = {float.class, float.class, String.class}
)

public class DeathScreenCharUnlockPatch {
    @SpirePostfixPatch
    public static void Postfix(ReturnToMenuButton __instance, float x, float y, String label) {

        String[] TEXT = CardCrawlGame.languagePack.getUIString("DeathScreen").TEXT;

        if (__instance.label == TEXT[37]) {
            SlimeboundMod.logger.info("text patch fired");
            if (UnlockTracker.isCharacterLocked("Guardian")) {
                SlimeboundMod.logger.info("first if");
                __instance.appear(Settings.WIDTH / 2.0F, Settings.HEIGHT * 0.15F, TEXT[40]);
                __instance.label = TEXT[40];
            } else if (UnlockTracker.isCharacterLocked("Hexaghost") && EvilModeCharacterSelect.evilMode && AbstractDungeon.player.chosenClass == GuardianEnum.GUARDIAN) {
                SlimeboundMod.logger.info("second if");
                __instance.appear(Settings.WIDTH / 2.0F, Settings.HEIGHT * 0.15F, TEXT[40]);
                __instance.label = TEXT[40];
            } else if ((UnlockTracker.isCharacterLocked("Snecko")) &&
                    !(UnlockTracker.isCharacterLocked("SlimeBoss")) &&
                    !(UnlockTracker.isCharacterLocked("Guardian")) &&
                    !(UnlockTracker.isCharacterLocked("Hexaghost")) &&
                    !(UnlockTracker.isCharacterLocked("Defect")) &&
                    !(UnlockTracker.isCharacterLocked("The Silent")) &&
                    !(UnlockTracker.isCharacterLocked("Ironclad")) &&
                    !(UnlockTracker.isCharacterLocked("Watcher"))) {
                SlimeboundMod.logger.info("third if");
                __instance.appear(Settings.WIDTH / 2.0F, Settings.HEIGHT * 0.15F, TEXT[40]);
                __instance.label = TEXT[40];
            }

        }
    }

}



