package io.jenkins.plugins.casc.impl;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Functions;
import org.kohsuke.accmod.Restricted;
import org.kohsuke.accmod.restrictions.NoExternalUse;

@Restricted(NoExternalUse.class)
public class Utils {

    @Restricted(NoExternalUse.class)
    public static String printThrowable(@NonNull Throwable t) {
        String s = Functions.printThrowable(t)
                .split("at io.jenkins.plugins.casc.ConfigurationAsCode.export")[0]
                .replaceAll("\n\t", "  ");
        return s.substring(0, s.lastIndexOf(")") + 1);
    }
}
