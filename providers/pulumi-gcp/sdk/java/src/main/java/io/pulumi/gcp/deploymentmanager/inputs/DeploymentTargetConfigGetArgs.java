// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.deploymentmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DeploymentTargetConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentTargetConfigGetArgs Empty = new DeploymentTargetConfigGetArgs();

    /**
     * The full contents of the template that you want to import.
     * 
     */
    @Import(name="content", required=true)
      private final Output<String> content;

    public Output<String> getContent() {
        return this.content;
    }

    public DeploymentTargetConfigGetArgs(Output<String> content) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
    }

    private DeploymentTargetConfigGetArgs() {
        this.content = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentTargetConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> content;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentTargetConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
        }

        public Builder content(Output<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }
        public Builder content(String content) {
            this.content = Output.of(Objects.requireNonNull(content));
            return this;
        }        public DeploymentTargetConfigGetArgs build() {
            return new DeploymentTargetConfigGetArgs(content);
        }
    }
}
