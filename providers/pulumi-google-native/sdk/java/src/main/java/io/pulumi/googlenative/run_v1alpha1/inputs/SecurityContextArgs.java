// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run SecurityContext holds security configuration that will be applied to a container. Some fields are present in both SecurityContext and PodSecurityContext. When both are set, the values in SecurityContext take precedence.
 * 
 */
public final class SecurityContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityContextArgs Empty = new SecurityContextArgs();

    /**
     * (Optional) The UID to run the entrypoint of the container process. Defaults to user specified in image metadata if unspecified. May also be set in PodSecurityContext. If set in both SecurityContext and PodSecurityContext, the value specified in SecurityContext takes precedence.
     * 
     */
    @InputImport(name="runAsUser")
      private final @Nullable Output<Integer> runAsUser;

    public Output<Integer> getRunAsUser() {
        return this.runAsUser == null ? Output.empty() : this.runAsUser;
    }

    public SecurityContextArgs(@Nullable Output<Integer> runAsUser) {
        this.runAsUser = runAsUser;
    }

    private SecurityContextArgs() {
        this.runAsUser = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> runAsUser;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.runAsUser = defaults.runAsUser;
        }

        public Builder runAsUser(@Nullable Output<Integer> runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        public Builder runAsUser(@Nullable Integer runAsUser) {
            this.runAsUser = Output.ofNullable(runAsUser);
            return this;
        }
        public SecurityContextArgs build() {
            return new SecurityContextArgs(runAsUser);
        }
    }
}
