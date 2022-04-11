// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningexperimentation;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * The name of the machine learning team account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The description of this project.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The friendly name for this project.
     * 
     */
    @Import(name="friendlyName", required=true)
      private final Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * The reference to git repo for this project.
     * 
     */
    @Import(name="gitrepo")
      private final @Nullable Output<String> gitrepo;

    public Output<String> getGitrepo() {
        return this.gitrepo == null ? Codegen.empty() : this.gitrepo;
    }

    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the machine learning project under a team account workspace.
     * 
     */
    @Import(name="projectName")
      private final @Nullable Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName == null ? Codegen.empty() : this.projectName;
    }

    /**
     * The name of the resource group to which the machine learning team account belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The name of the machine learning team account workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public ProjectArgs(
        Output<String> accountName,
        @Nullable Output<String> description,
        Output<String> friendlyName,
        @Nullable Output<String> gitrepo,
        @Nullable Output<String> location,
        @Nullable Output<String> projectName,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        Output<String> workspaceName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.friendlyName = Objects.requireNonNull(friendlyName, "expected parameter 'friendlyName' to be non-null");
        this.gitrepo = gitrepo;
        this.location = location;
        this.projectName = projectName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private ProjectArgs() {
        this.accountName = Codegen.empty();
        this.description = Codegen.empty();
        this.friendlyName = Codegen.empty();
        this.gitrepo = Codegen.empty();
        this.location = Codegen.empty();
        this.projectName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> description;
        private Output<String> friendlyName;
        private @Nullable Output<String> gitrepo;
        private @Nullable Output<String> location;
        private @Nullable Output<String> projectName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.friendlyName = defaults.friendlyName;
    	      this.gitrepo = defaults.gitrepo;
    	      this.location = defaults.location;
    	      this.projectName = defaults.projectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
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
        public Builder friendlyName(Output<String> friendlyName) {
            this.friendlyName = Objects.requireNonNull(friendlyName);
            return this;
        }
        public Builder friendlyName(String friendlyName) {
            this.friendlyName = Output.of(Objects.requireNonNull(friendlyName));
            return this;
        }
        public Builder gitrepo(@Nullable Output<String> gitrepo) {
            this.gitrepo = gitrepo;
            return this;
        }
        public Builder gitrepo(@Nullable String gitrepo) {
            this.gitrepo = Codegen.ofNullable(gitrepo);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder projectName(@Nullable Output<String> projectName) {
            this.projectName = projectName;
            return this;
        }
        public Builder projectName(@Nullable String projectName) {
            this.projectName = Codegen.ofNullable(projectName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public ProjectArgs build() {
            return new ProjectArgs(accountName, description, friendlyName, gitrepo, location, projectName, resourceGroupName, tags, workspaceName);
        }
    }
}
