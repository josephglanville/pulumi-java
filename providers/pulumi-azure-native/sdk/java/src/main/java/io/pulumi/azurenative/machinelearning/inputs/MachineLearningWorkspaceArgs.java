// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the machine learning workspace containing the experiment that is source for the web service.
 * 
 */
public final class MachineLearningWorkspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineLearningWorkspaceArgs Empty = new MachineLearningWorkspaceArgs();

    /**
     * Specifies the workspace ID of the machine learning workspace associated with the web service
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public MachineLearningWorkspaceArgs(Output<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private MachineLearningWorkspaceArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningWorkspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineLearningWorkspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }        public MachineLearningWorkspaceArgs build() {
            return new MachineLearningWorkspaceArgs(id);
        }
    }
}
