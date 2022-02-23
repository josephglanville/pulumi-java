// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyArgs Empty = new GetOrganizationPolicyArgs();

    /**
     * (Required) The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @InputImport(name="constraint", required=true)
      private final String constraint;

    public String getConstraint() {
        return this.constraint;
    }

    /**
     * The project ID.
     * 
     */
    @InputImport(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    public GetOrganizationPolicyArgs(
        String constraint,
        String project) {
        this.constraint = Objects.requireNonNull(constraint, "expected parameter 'constraint' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private GetOrganizationPolicyArgs() {
        this.constraint = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String constraint;
        private String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraint = defaults.constraint;
    	      this.project = defaults.project;
        }

        public Builder setConstraint(String constraint) {
            this.constraint = Objects.requireNonNull(constraint);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public GetOrganizationPolicyArgs build() {
            return new GetOrganizationPolicyArgs(constraint, project);
        }
    }
}
