// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssignmentArgs Empty = new GetAssignmentArgs();

    @InputImport(name="assignmentId", required=true)
    private final String assignmentId;

    public String getAssignmentId() {
        return this.assignmentId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAssignmentArgs(
        String assignmentId,
        String resourceGroupName) {
        this.assignmentId = Objects.requireNonNull(assignmentId, "expected parameter 'assignmentId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAssignmentArgs() {
        this.assignmentId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentId = defaults.assignmentId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAssignmentId(String assignmentId) {
            this.assignmentId = Objects.requireNonNull(assignmentId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAssignmentArgs build() {
            return new GetAssignmentArgs(assignmentId, resourceGroupName);
        }
    }
}
