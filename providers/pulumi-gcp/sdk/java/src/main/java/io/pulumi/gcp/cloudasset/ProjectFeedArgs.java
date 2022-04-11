// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudasset;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudasset.inputs.ProjectFeedConditionArgs;
import io.pulumi.gcp.cloudasset.inputs.ProjectFeedFeedOutputConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectFeedArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFeedArgs Empty = new ProjectFeedArgs();

    /**
     * A list of the full names of the assets to receive updates. You must specify either or both of
     * assetNames and assetTypes. Only asset updates matching specified assetNames and assetTypes are
     * exported to the feed. For example: //compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1.
     * See https://cloud.google.com/apis/design/resourceNames#fullResourceName for more info.
     * 
     */
    @Import(name="assetNames")
      private final @Nullable Output<List<String>> assetNames;

    public Output<List<String>> getAssetNames() {
        return this.assetNames == null ? Codegen.empty() : this.assetNames;
    }

    /**
     * A list of types of the assets to receive updates. You must specify either or both of assetNames
     * and assetTypes. Only asset updates matching specified assetNames and assetTypes are exported to
     * the feed. For example: "compute.googleapis.com/Disk"
     * See https://cloud.google.com/asset-inventory/docs/supported-asset-types for a list of all
     * supported asset types.
     * 
     */
    @Import(name="assetTypes")
      private final @Nullable Output<List<String>> assetTypes;

    public Output<List<String>> getAssetTypes() {
        return this.assetTypes == null ? Codegen.empty() : this.assetTypes;
    }

    /**
     * The project whose identity will be used when sending messages to the
     * destination pubsub topic. It also specifies the project for API
     * enablement check, quota, and billing. If not specified, the resource's
     * project will be used.
     * 
     */
    @Import(name="billingProject")
      private final @Nullable Output<String> billingProject;

    public Output<String> getBillingProject() {
        return this.billingProject == null ? Codegen.empty() : this.billingProject;
    }

    /**
     * A condition which determines whether an asset update should be published. If specified, an asset
     * will be returned only when the expression evaluates to true. When set, expression field
     * must be a valid CEL expression on a TemporalAsset with name temporal_asset. Example: a Feed with
     * expression "temporal_asset.deleted == true" will only publish Asset deletions. Other fields of
     * condition are optional.
     * Structure is documented below.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<ProjectFeedConditionArgs> condition;

    public Output<ProjectFeedConditionArgs> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Asset content type. If not specified, no content but the asset name and type will be returned.
     * Possible values are `CONTENT_TYPE_UNSPECIFIED`, `RESOURCE`, `IAM_POLICY`, `ORG_POLICY`, and `ACCESS_POLICY`.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * This is the client-assigned asset feed identifier and it needs to be unique under a specific parent.
     * 
     */
    @Import(name="feedId", required=true)
      private final Output<String> feedId;

    public Output<String> getFeedId() {
        return this.feedId;
    }

    /**
     * Output configuration for asset feed destination.
     * Structure is documented below.
     * 
     */
    @Import(name="feedOutputConfig", required=true)
      private final Output<ProjectFeedFeedOutputConfigArgs> feedOutputConfig;

    public Output<ProjectFeedFeedOutputConfigArgs> getFeedOutputConfig() {
        return this.feedOutputConfig;
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

    public ProjectFeedArgs(
        @Nullable Output<List<String>> assetNames,
        @Nullable Output<List<String>> assetTypes,
        @Nullable Output<String> billingProject,
        @Nullable Output<ProjectFeedConditionArgs> condition,
        @Nullable Output<String> contentType,
        Output<String> feedId,
        Output<ProjectFeedFeedOutputConfigArgs> feedOutputConfig,
        @Nullable Output<String> project) {
        this.assetNames = assetNames;
        this.assetTypes = assetTypes;
        this.billingProject = billingProject;
        this.condition = condition;
        this.contentType = contentType;
        this.feedId = Objects.requireNonNull(feedId, "expected parameter 'feedId' to be non-null");
        this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig, "expected parameter 'feedOutputConfig' to be non-null");
        this.project = project;
    }

    private ProjectFeedArgs() {
        this.assetNames = Codegen.empty();
        this.assetTypes = Codegen.empty();
        this.billingProject = Codegen.empty();
        this.condition = Codegen.empty();
        this.contentType = Codegen.empty();
        this.feedId = Codegen.empty();
        this.feedOutputConfig = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFeedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> assetNames;
        private @Nullable Output<List<String>> assetTypes;
        private @Nullable Output<String> billingProject;
        private @Nullable Output<ProjectFeedConditionArgs> condition;
        private @Nullable Output<String> contentType;
        private Output<String> feedId;
        private Output<ProjectFeedFeedOutputConfigArgs> feedOutputConfig;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFeedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetNames = defaults.assetNames;
    	      this.assetTypes = defaults.assetTypes;
    	      this.billingProject = defaults.billingProject;
    	      this.condition = defaults.condition;
    	      this.contentType = defaults.contentType;
    	      this.feedId = defaults.feedId;
    	      this.feedOutputConfig = defaults.feedOutputConfig;
    	      this.project = defaults.project;
        }

        public Builder assetNames(@Nullable Output<List<String>> assetNames) {
            this.assetNames = assetNames;
            return this;
        }
        public Builder assetNames(@Nullable List<String> assetNames) {
            this.assetNames = Codegen.ofNullable(assetNames);
            return this;
        }
        public Builder assetNames(String... assetNames) {
            return assetNames(List.of(assetNames));
        }
        public Builder assetTypes(@Nullable Output<List<String>> assetTypes) {
            this.assetTypes = assetTypes;
            return this;
        }
        public Builder assetTypes(@Nullable List<String> assetTypes) {
            this.assetTypes = Codegen.ofNullable(assetTypes);
            return this;
        }
        public Builder assetTypes(String... assetTypes) {
            return assetTypes(List.of(assetTypes));
        }
        public Builder billingProject(@Nullable Output<String> billingProject) {
            this.billingProject = billingProject;
            return this;
        }
        public Builder billingProject(@Nullable String billingProject) {
            this.billingProject = Codegen.ofNullable(billingProject);
            return this;
        }
        public Builder condition(@Nullable Output<ProjectFeedConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable ProjectFeedConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder feedId(Output<String> feedId) {
            this.feedId = Objects.requireNonNull(feedId);
            return this;
        }
        public Builder feedId(String feedId) {
            this.feedId = Output.of(Objects.requireNonNull(feedId));
            return this;
        }
        public Builder feedOutputConfig(Output<ProjectFeedFeedOutputConfigArgs> feedOutputConfig) {
            this.feedOutputConfig = Objects.requireNonNull(feedOutputConfig);
            return this;
        }
        public Builder feedOutputConfig(ProjectFeedFeedOutputConfigArgs feedOutputConfig) {
            this.feedOutputConfig = Output.of(Objects.requireNonNull(feedOutputConfig));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public ProjectFeedArgs build() {
            return new ProjectFeedArgs(assetNames, assetTypes, billingProject, condition, contentType, feedId, feedOutputConfig, project);
        }
    }
}
