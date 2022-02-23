// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.workflows;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowArgs Empty = new WorkflowArgs();

    /**
     * Description of the workflow provided by the user. Must be at most 1000 unicode characters long.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A set of key/value label pairs to assign to this Workflow.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the Workflow.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the
     * specified prefix. If this and name are unspecified, a random value is chosen for the name.
     * 
     */
    @InputImport(name="namePrefix")
      private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the workflow.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Name of the service account associated with the latest workflow version. This service
     * account represents the identity of the workflow and determines what permissions the workflow has.
     * Format: projects/{project}/serviceAccounts/{account}.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Workflow code to be executed. The size limit is 32KB.
     * 
     */
    @InputImport(name="sourceContents")
      private final @Nullable Input<String> sourceContents;

    public Input<String> getSourceContents() {
        return this.sourceContents == null ? Input.empty() : this.sourceContents;
    }

    public WorkflowArgs(
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<String> sourceContents) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.namePrefix = namePrefix;
        this.project = project;
        this.region = region;
        this.serviceAccount = serviceAccount;
        this.sourceContents = sourceContents;
    }

    private WorkflowArgs() {
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.serviceAccount = Input.empty();
        this.sourceContents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<String> sourceContents;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceContents = defaults.sourceContents;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setSourceContents(@Nullable Input<String> sourceContents) {
            this.sourceContents = sourceContents;
            return this;
        }

        public Builder setSourceContents(@Nullable String sourceContents) {
            this.sourceContents = Input.ofNullable(sourceContents);
            return this;
        }
        public WorkflowArgs build() {
            return new WorkflowArgs(description, labels, name, namePrefix, project, region, serviceAccount, sourceContents);
        }
    }
}
