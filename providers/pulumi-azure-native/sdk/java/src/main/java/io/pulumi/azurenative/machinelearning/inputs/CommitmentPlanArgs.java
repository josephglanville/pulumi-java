// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the machine learning commitment plan associated with the web service.
 * 
 */
public final class CommitmentPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommitmentPlanArgs Empty = new CommitmentPlanArgs();

    /**
     * Specifies the Azure Resource Manager ID of the commitment plan associated with the web service.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public CommitmentPlanArgs(Output<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private CommitmentPlanArgs() {
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPlanArgs defaults) {
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
        }        public CommitmentPlanArgs build() {
            return new CommitmentPlanArgs(id);
        }
    }
}
