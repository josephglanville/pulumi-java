// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class FlexibleAppVersionEntrypointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionEntrypointGetArgs Empty = new FlexibleAppVersionEntrypointGetArgs();

    /**
     * The format should be a shell command that can be fed to bash -c.
     * 
     */
    @Import(name="shell", required=true)
      private final Output<String> shell;

    public Output<String> getShell() {
        return this.shell;
    }

    public FlexibleAppVersionEntrypointGetArgs(Output<String> shell) {
        this.shell = Objects.requireNonNull(shell, "expected parameter 'shell' to be non-null");
    }

    private FlexibleAppVersionEntrypointGetArgs() {
        this.shell = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionEntrypointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> shell;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionEntrypointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.shell = defaults.shell;
        }

        public Builder shell(Output<String> shell) {
            this.shell = Objects.requireNonNull(shell);
            return this;
        }
        public Builder shell(String shell) {
            this.shell = Output.of(Objects.requireNonNull(shell));
            return this;
        }        public FlexibleAppVersionEntrypointGetArgs build() {
            return new FlexibleAppVersionEntrypointGetArgs(shell);
        }
    }
}
