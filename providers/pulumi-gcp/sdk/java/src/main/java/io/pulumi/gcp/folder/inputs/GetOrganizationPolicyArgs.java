// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.folder.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyArgs Empty = new GetOrganizationPolicyArgs();

    /**
     * (Required) The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Import(name="constraint", required=true)
      private final String constraint;

    public String getConstraint() {
        return this.constraint;
    }

    /**
     * The resource name of the folder to set the policy for. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder", required=true)
      private final String folder;

    public String getFolder() {
        return this.folder;
    }

    public GetOrganizationPolicyArgs(
        String constraint,
        String folder) {
        this.constraint = Objects.requireNonNull(constraint, "expected parameter 'constraint' to be non-null");
        this.folder = Objects.requireNonNull(folder, "expected parameter 'folder' to be non-null");
    }

    private GetOrganizationPolicyArgs() {
        this.constraint = null;
        this.folder = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String constraint;
        private String folder;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraint = defaults.constraint;
    	      this.folder = defaults.folder;
        }

        public Builder constraint(String constraint) {
            this.constraint = Objects.requireNonNull(constraint);
            return this;
        }
        public Builder folder(String folder) {
            this.folder = Objects.requireNonNull(folder);
            return this;
        }        public GetOrganizationPolicyArgs build() {
            return new GetOrganizationPolicyArgs(constraint, folder);
        }
    }
}
