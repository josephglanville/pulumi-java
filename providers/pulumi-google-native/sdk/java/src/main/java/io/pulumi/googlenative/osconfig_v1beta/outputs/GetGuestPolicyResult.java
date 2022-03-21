// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1beta.outputs.AssignmentResponse;
import io.pulumi.googlenative.osconfig_v1beta.outputs.PackageRepositoryResponse;
import io.pulumi.googlenative.osconfig_v1beta.outputs.PackageResponse;
import io.pulumi.googlenative.osconfig_v1beta.outputs.SoftwareRecipeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGuestPolicyResult {
    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
     */
    private final AssignmentResponse assignment;
    /**
     * Time this guest policy was created.
     * 
     */
    private final String createTime;
    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    private final String description;
    /**
     * The etag for this guest policy. If this is provided on update, it must match the server's etag.
     * 
     */
    private final String etag;
    /**
     * Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
     */
    private final String name;
    /**
     * A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
     */
    private final List<PackageRepositoryResponse> packageRepositories;
    /**
     * The software packages to be managed by this policy.
     * 
     */
    private final List<PackageResponse> packages;
    /**
     * A list of Recipes to install on the VM instance.
     * 
     */
    private final List<SoftwareRecipeResponse> recipes;
    /**
     * Last time this guest policy was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetGuestPolicyResult(
        @CustomType.Parameter("assignment") AssignmentResponse assignment,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("packageRepositories") List<PackageRepositoryResponse> packageRepositories,
        @CustomType.Parameter("packages") List<PackageResponse> packages,
        @CustomType.Parameter("recipes") List<SoftwareRecipeResponse> recipes,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.assignment = assignment;
        this.createTime = createTime;
        this.description = description;
        this.etag = etag;
        this.name = name;
        this.packageRepositories = packageRepositories;
        this.packages = packages;
        this.recipes = recipes;
        this.updateTime = updateTime;
    }

    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
    */
    public AssignmentResponse getAssignment() {
        return this.assignment;
    }
    /**
     * Time this guest policy was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The etag for this guest policy. If this is provided on update, it must match the server's etag.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
    */
    public List<PackageRepositoryResponse> getPackageRepositories() {
        return this.packageRepositories;
    }
    /**
     * The software packages to be managed by this policy.
     * 
    */
    public List<PackageResponse> getPackages() {
        return this.packages;
    }
    /**
     * A list of Recipes to install on the VM instance.
     * 
    */
    public List<SoftwareRecipeResponse> getRecipes() {
        return this.recipes;
    }
    /**
     * Last time this guest policy was updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssignmentResponse assignment;
        private String createTime;
        private String description;
        private String etag;
        private String name;
        private List<PackageRepositoryResponse> packageRepositories;
        private List<PackageResponse> packages;
        private List<SoftwareRecipeResponse> recipes;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.packageRepositories = defaults.packageRepositories;
    	      this.packages = defaults.packages;
    	      this.recipes = defaults.recipes;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder assignment(AssignmentResponse assignment) {
            this.assignment = Objects.requireNonNull(assignment);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder packageRepositories(List<PackageRepositoryResponse> packageRepositories) {
            this.packageRepositories = Objects.requireNonNull(packageRepositories);
            return this;
        }
        public Builder packageRepositories(PackageRepositoryResponse... packageRepositories) {
            return packageRepositories(List.of(packageRepositories));
        }
        public Builder packages(List<PackageResponse> packages) {
            this.packages = Objects.requireNonNull(packages);
            return this;
        }
        public Builder packages(PackageResponse... packages) {
            return packages(List.of(packages));
        }
        public Builder recipes(List<SoftwareRecipeResponse> recipes) {
            this.recipes = Objects.requireNonNull(recipes);
            return this;
        }
        public Builder recipes(SoftwareRecipeResponse... recipes) {
            return recipes(List.of(recipes));
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGuestPolicyResult build() {
            return new GetGuestPolicyResult(assignment, createTime, description, etag, name, packageRepositories, packages, recipes, updateTime);
        }
    }
}
