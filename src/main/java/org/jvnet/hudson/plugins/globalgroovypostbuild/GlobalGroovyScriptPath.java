package org.jvnet.hudson.plugins.globalgroovypostbuild;

import hudson.Extension;
import hudson.model.AbstractDescribableImpl;
import hudson.model.Descriptor;
import org.kohsuke.stapler.DataBoundConstructor;

import java.io.File;

/**
 * @author <a href="mailto:nicolas.deloof@cloudbees.com">Nicolas De loof</a>
 */
public class GlobalGroovyScriptPath extends AbstractDescribableImpl<GlobalGroovyScriptPath> {

    private final File path;

    @DataBoundConstructor
    public GlobalGroovyScriptPath(String path) {
        this.path = new File(path).getAbsoluteFile();
    }

    public File getPath() {
        return path;
    }

    @Extension
    public static class GroovyScriptPathDescriptor extends Descriptor<GlobalGroovyScriptPath> {

        @Override
        public String getDisplayName() {
            return "";
        }
    }
}
