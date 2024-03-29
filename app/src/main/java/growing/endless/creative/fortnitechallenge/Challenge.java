package growing.endless.creative.fortnitechallenge;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * @author Jonathan Alexander Norberg
 * @version 2018-04-27
 */

public class Challenge {
    public static ArrayList<String> getChallenge(Activity context){
        ArrayList<String> challenges = new ArrayList<>();
        final SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(context);
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeYouWillDieAlot)).getText()),true)) {
            addYouWillDie(context, challenges);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeEasy)).getText()),true)) {
            addEasy(context,challenges);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeFunny)).getText()),true)) {
            addFunny(context, challenges);
        }
        if(sharedPreferences.getBoolean(String.valueOf(((CheckBox)context.findViewById(R.id.checkBoxChallengeDuoSquad)).getText()),true)) {
            addSquadDuo(context, challenges);
        }
        return challenges;
    }

    private static void addEasy(Activity context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.challengeOnlyShotgun));
        challenges.add(context.getString(R.string.challengeOnlyHandguns));
        challenges.add(context.getString(R.string.challengeOnlySniper));
        challenges.add(context.getString(R.string.challengeHilltop));
        challenges.add(context.getString(R.string.challengeStaircaseToHeaven));

    }

    private static void addSquadDuo(Activity context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.squadOrDuoSilence));
        challenges.add(context.getString(R.string.squadOrDuoCarePackage));
        challenges.add(context.getString(R.string.squadOrDuoPackageNoKIll));
        challenges.add(context.getString(R.string.squadOrDuoKillFriendFinal));
        challenges.add(context.getString(R.string.squadOrDuoLetterE));
        challenges.add(context.getString(R.string.squadOrDuoKills25));
        challenges.add(context.getString(R.string.squadOrDuoKill5));
        challenges.add(context.getString(R.string.squadOrDuoKill5Teamates));
        challenges.add(context.getString(R.string.squadOrDuoKill5TeamatesReader));
        challenges.add(context.getString(R.string.squadOrDuoKillSolo));
        challenges.add(context.getString(R.string.squadOrDuoKillSoloWorst));
        challenges.add(context.getString(R.string.squadOrDuoKillSoloBest));
        challenges.add(context.getString(R.string.squadOrDuoSensitivity));
        challenges.add(context.getString(R.string.squadOrDuoSensitivityEveryone));
        challenges.add(context.getString(R.string.squadOrDuoDownMansSaved));
        challenges.add(context.getString(R.string.squadOrDuoDownMansDead));
        challenges.add(context.getString(R.string.squadOrDuoSilenceCoordinates));


    }

    private static void addFunny(Activity context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.challengeSneak));
        challenges.add(context.getString(R.string.challengeThreeSixty));
        challenges.add(context.getString(R.string.challengeDance));
        challenges.add(context.getString(R.string.challengeLink));
        challenges.add(context.getString(R.string.challengeIncreaseSens));
        challenges.add(context.getString(R.string.challengeLowerSens));

    }

    private static void addYouWillDie(Context context, ArrayList<String> challenges) {
        challenges.add(context.getString(R.string.challengeWithoutKilling));
        challenges.add(context.getString(R.string.challengeCrossbow));
        challenges.add(context.getString(R.string.challengeOnlyHipfireSniper));

        challenges.add(context.getString(R.string.challengeOnlyMelee));
        challenges.add(context.getString(R.string.challengeWinTwoTimes));
        challenges.add(context.getString(R.string.challengeWinWithoutKilling));
        challenges.add(context.getString(R.string.challengeKillTen));
        challenges.add(context.getString(R.string.challengeMouseKeyboard));
        challenges.add(context.getString(R.string.challengePistol));


    }
}
