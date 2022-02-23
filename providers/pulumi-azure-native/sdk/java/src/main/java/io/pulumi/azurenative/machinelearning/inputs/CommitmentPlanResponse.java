// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the machine learning commitment plan associated with the web service.
 * 
 */
public final class CommitmentPlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommitmentPlanResponse Empty = new CommitmentPlanResponse();

    /**
     * Specifies the Azure Resource Manager ID of the commitment plan associated with the web service.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public CommitmentPlanResponse(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private CommitmentPlanResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public CommitmentPlanResponse build() {
            return new CommitmentPlanResponse(id);
        }
    }
}
