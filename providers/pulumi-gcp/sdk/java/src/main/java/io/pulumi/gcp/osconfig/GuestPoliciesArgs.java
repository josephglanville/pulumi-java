// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesAssignmentArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesPackageRepositoryArgs;
import io.pulumi.gcp.osconfig.inputs.GuestPoliciesRecipeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestPoliciesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesArgs Empty = new GuestPoliciesArgs();

    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets
     * or groups of VM instances by different parameters such as labels, names, OS, or zones.
     * If left empty, all VM instances underneath this policy are targeted.
     * At the same level in the resource hierarchy (that is within a project), the service prevents
     * the creation of multiple policies that conflict with each other.
     * For more information, see how the service
     * [handles assignment conflicts](https://cloud.google.com/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * Structure is documented below.
     * 
     */
    @Import(name="assignment", required=true)
      private final Output<GuestPoliciesAssignmentArgs> assignment;

    public Output<GuestPoliciesAssignmentArgs> getAssignment() {
        return this.assignment;
    }

    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The etag for this guest policy. If this is provided on update, it must match the server's etag.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The logical name of the guest policy in the project with the following restrictions:
     * * Must contain only lowercase letters, numbers, and hyphens.
     * * Must start with a letter.
     * * Must be between 1-63 characters.
     * * Must end with a number or a letter.
     * * Must be unique within the project.
     * 
     */
    @Import(name="guestPolicyId", required=true)
      private final Output<String> guestPolicyId;

    public Output<String> getGuestPolicyId() {
        return this.guestPolicyId;
    }

    /**
     * A list of package repositories to configure on the VM instance.
     * This is done before any other configs are applied so they can use these repos.
     * Package repositories are only configured if the corresponding package manager(s) are available.
     * Structure is documented below.
     * 
     */
    @Import(name="packageRepositories")
      private final @Nullable Output<List<GuestPoliciesPackageRepositoryArgs>> packageRepositories;

    public Output<List<GuestPoliciesPackageRepositoryArgs>> getPackageRepositories() {
        return this.packageRepositories == null ? Codegen.empty() : this.packageRepositories;
    }

    /**
     * The software packages to be managed by this policy.
     * Structure is documented below.
     * 
     */
    @Import(name="packages")
      private final @Nullable Output<List<GuestPoliciesPackageArgs>> packages;

    public Output<List<GuestPoliciesPackageArgs>> getPackages() {
        return this.packages == null ? Codegen.empty() : this.packages;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A list of Recipes to install on the VM instance.
     * Structure is documented below.
     * 
     */
    @Import(name="recipes")
      private final @Nullable Output<List<GuestPoliciesRecipeArgs>> recipes;

    public Output<List<GuestPoliciesRecipeArgs>> getRecipes() {
        return this.recipes == null ? Codegen.empty() : this.recipes;
    }

    public GuestPoliciesArgs(
        Output<GuestPoliciesAssignmentArgs> assignment,
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        Output<String> guestPolicyId,
        @Nullable Output<List<GuestPoliciesPackageRepositoryArgs>> packageRepositories,
        @Nullable Output<List<GuestPoliciesPackageArgs>> packages,
        @Nullable Output<String> project,
        @Nullable Output<List<GuestPoliciesRecipeArgs>> recipes) {
        this.assignment = Objects.requireNonNull(assignment, "expected parameter 'assignment' to be non-null");
        this.description = description;
        this.etag = etag;
        this.guestPolicyId = Objects.requireNonNull(guestPolicyId, "expected parameter 'guestPolicyId' to be non-null");
        this.packageRepositories = packageRepositories;
        this.packages = packages;
        this.project = project;
        this.recipes = recipes;
    }

    private GuestPoliciesArgs() {
        this.assignment = Codegen.empty();
        this.description = Codegen.empty();
        this.etag = Codegen.empty();
        this.guestPolicyId = Codegen.empty();
        this.packageRepositories = Codegen.empty();
        this.packages = Codegen.empty();
        this.project = Codegen.empty();
        this.recipes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GuestPoliciesAssignmentArgs> assignment;
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private Output<String> guestPolicyId;
        private @Nullable Output<List<GuestPoliciesPackageRepositoryArgs>> packageRepositories;
        private @Nullable Output<List<GuestPoliciesPackageArgs>> packages;
        private @Nullable Output<String> project;
        private @Nullable Output<List<GuestPoliciesRecipeArgs>> recipes;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.guestPolicyId = defaults.guestPolicyId;
    	      this.packageRepositories = defaults.packageRepositories;
    	      this.packages = defaults.packages;
    	      this.project = defaults.project;
    	      this.recipes = defaults.recipes;
        }

        public Builder assignment(Output<GuestPoliciesAssignmentArgs> assignment) {
            this.assignment = Objects.requireNonNull(assignment);
            return this;
        }
        public Builder assignment(GuestPoliciesAssignmentArgs assignment) {
            this.assignment = Output.of(Objects.requireNonNull(assignment));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder guestPolicyId(Output<String> guestPolicyId) {
            this.guestPolicyId = Objects.requireNonNull(guestPolicyId);
            return this;
        }
        public Builder guestPolicyId(String guestPolicyId) {
            this.guestPolicyId = Output.of(Objects.requireNonNull(guestPolicyId));
            return this;
        }
        public Builder packageRepositories(@Nullable Output<List<GuestPoliciesPackageRepositoryArgs>> packageRepositories) {
            this.packageRepositories = packageRepositories;
            return this;
        }
        public Builder packageRepositories(@Nullable List<GuestPoliciesPackageRepositoryArgs> packageRepositories) {
            this.packageRepositories = Codegen.ofNullable(packageRepositories);
            return this;
        }
        public Builder packageRepositories(GuestPoliciesPackageRepositoryArgs... packageRepositories) {
            return packageRepositories(List.of(packageRepositories));
        }
        public Builder packages(@Nullable Output<List<GuestPoliciesPackageArgs>> packages) {
            this.packages = packages;
            return this;
        }
        public Builder packages(@Nullable List<GuestPoliciesPackageArgs> packages) {
            this.packages = Codegen.ofNullable(packages);
            return this;
        }
        public Builder packages(GuestPoliciesPackageArgs... packages) {
            return packages(List.of(packages));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder recipes(@Nullable Output<List<GuestPoliciesRecipeArgs>> recipes) {
            this.recipes = recipes;
            return this;
        }
        public Builder recipes(@Nullable List<GuestPoliciesRecipeArgs> recipes) {
            this.recipes = Codegen.ofNullable(recipes);
            return this;
        }
        public Builder recipes(GuestPoliciesRecipeArgs... recipes) {
            return recipes(List.of(recipes));
        }        public GuestPoliciesArgs build() {
            return new GuestPoliciesArgs(assignment, description, etag, guestPolicyId, packageRepositories, packages, project, recipes);
        }
    }
}
