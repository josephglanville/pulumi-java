// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains settings for the SSM agent on your build instance.
 * 
 */
public final class ImageRecipeSystemsManagerAgentArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeSystemsManagerAgentArgs Empty = new ImageRecipeSystemsManagerAgentArgs();

    /**
     * Controls whether the SSM agent is removed from your final build image, prior to creating the new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is left in, so that it is included in the new AMI. The default value is false.
     * 
     */
    @Import(name="uninstallAfterBuild")
      private final @Nullable Output<Boolean> uninstallAfterBuild;

    public Output<Boolean> getUninstallAfterBuild() {
        return this.uninstallAfterBuild == null ? Codegen.empty() : this.uninstallAfterBuild;
    }

    public ImageRecipeSystemsManagerAgentArgs(@Nullable Output<Boolean> uninstallAfterBuild) {
        this.uninstallAfterBuild = uninstallAfterBuild;
    }

    private ImageRecipeSystemsManagerAgentArgs() {
        this.uninstallAfterBuild = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeSystemsManagerAgentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> uninstallAfterBuild;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeSystemsManagerAgentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uninstallAfterBuild = defaults.uninstallAfterBuild;
        }

        public Builder uninstallAfterBuild(@Nullable Output<Boolean> uninstallAfterBuild) {
            this.uninstallAfterBuild = uninstallAfterBuild;
            return this;
        }
        public Builder uninstallAfterBuild(@Nullable Boolean uninstallAfterBuild) {
            this.uninstallAfterBuild = Codegen.ofNullable(uninstallAfterBuild);
            return this;
        }        public ImageRecipeSystemsManagerAgentArgs build() {
            return new ImageRecipeSystemsManagerAgentArgs(uninstallAfterBuild);
        }
    }
}
