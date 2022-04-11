// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.ProjectServiceCatalogProvisioningDetailsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Project.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A description for the project.
     * 
     */
    @Import(name="projectDescription")
      private final @Nullable Output<String> projectDescription;

    public Output<String> getProjectDescription() {
        return this.projectDescription == null ? Codegen.empty() : this.projectDescription;
    }

    /**
     * The ID of the project.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId == null ? Codegen.empty() : this.projectId;
    }

    /**
     * The name of the Project.
     * 
     */
    @Import(name="projectName")
      private final @Nullable Output<String> projectName;

    public Output<String> getProjectName() {
        return this.projectName == null ? Codegen.empty() : this.projectName;
    }

    /**
     * The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * 
     */
    @Import(name="serviceCatalogProvisioningDetails")
      private final @Nullable Output<ProjectServiceCatalogProvisioningDetailsGetArgs> serviceCatalogProvisioningDetails;

    public Output<ProjectServiceCatalogProvisioningDetailsGetArgs> getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails == null ? Codegen.empty() : this.serviceCatalogProvisioningDetails;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public ProjectState(
        @Nullable Output<String> arn,
        @Nullable Output<String> projectDescription,
        @Nullable Output<String> projectId,
        @Nullable Output<String> projectName,
        @Nullable Output<ProjectServiceCatalogProvisioningDetailsGetArgs> serviceCatalogProvisioningDetails,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.projectDescription = projectDescription;
        this.projectId = projectId;
        this.projectName = projectName;
        this.serviceCatalogProvisioningDetails = serviceCatalogProvisioningDetails;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ProjectState() {
        this.arn = Codegen.empty();
        this.projectDescription = Codegen.empty();
        this.projectId = Codegen.empty();
        this.projectName = Codegen.empty();
        this.serviceCatalogProvisioningDetails = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> projectDescription;
        private @Nullable Output<String> projectId;
        private @Nullable Output<String> projectName;
        private @Nullable Output<ProjectServiceCatalogProvisioningDetailsGetArgs> serviceCatalogProvisioningDetails;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.projectDescription = defaults.projectDescription;
    	      this.projectId = defaults.projectId;
    	      this.projectName = defaults.projectName;
    	      this.serviceCatalogProvisioningDetails = defaults.serviceCatalogProvisioningDetails;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder projectDescription(@Nullable Output<String> projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public Builder projectDescription(@Nullable String projectDescription) {
            this.projectDescription = Codegen.ofNullable(projectDescription);
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Codegen.ofNullable(projectId);
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
        public Builder serviceCatalogProvisioningDetails(@Nullable Output<ProjectServiceCatalogProvisioningDetailsGetArgs> serviceCatalogProvisioningDetails) {
            this.serviceCatalogProvisioningDetails = serviceCatalogProvisioningDetails;
            return this;
        }
        public Builder serviceCatalogProvisioningDetails(@Nullable ProjectServiceCatalogProvisioningDetailsGetArgs serviceCatalogProvisioningDetails) {
            this.serviceCatalogProvisioningDetails = Codegen.ofNullable(serviceCatalogProvisioningDetails);
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
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public ProjectState build() {
            return new ProjectState(arn, projectDescription, projectId, projectName, serviceCatalogProvisioningDetails, tags, tagsAll);
        }
    }
}
