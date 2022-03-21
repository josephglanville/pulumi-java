// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.logging.inputs.ProjectSinkBigqueryOptionsArgs;
import io.pulumi.gcp.logging.inputs.ProjectSinkExclusionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectSinkArgs Empty = new ProjectSinkArgs();

    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @Import(name="bigqueryOptions")
      private final @Nullable Output<ProjectSinkBigqueryOptionsArgs> bigqueryOptions;

    public Output<ProjectSinkBigqueryOptionsArgs> getBigqueryOptions() {
        return this.bigqueryOptions == null ? Output.empty() : this.bigqueryOptions;
    }

    /**
     * A description of this exclusion.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The destination of the sink (or, in other words, where logs are written to). Can be a
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket . Examples:
     * 
     * The writer associated with the sink must have access to write to the above resource.
     * 
     */
    @Import(name="destination", required=true)
      private final Output<String> destination;

    public Output<String> getDestination() {
        return this.destination;
    }

    /**
     * If set to True, then this exclusion is disabled and it does not exclude any log entries.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * Log entries that match any of the exclusion filters will not be exported. If a log entry is matched by both filter and one of exclusion_filters it will not be exported.  Can be repeated multiple times for multiple exclusions. Structure is documented below.
     * 
     */
    @Import(name="exclusions")
      private final @Nullable Output<List<ProjectSinkExclusionArgs>> exclusions;

    public Output<List<ProjectSinkExclusionArgs>> getExclusions() {
        return this.exclusions == null ? Output.empty() : this.exclusions;
    }

    /**
     * An advanced logs filter that matches the log entries to be excluded. By using the sample function, you can exclude less than 100% of the matching log entries. See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced_filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<String> filter;

    public Output<String> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * A client-assigned identifier, such as `load-balancer-exclusion`. Identifiers are limited to 100 characters and can include only letters, digits, underscores, hyphens, and periods. First character has to be alphanumeric.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project to create the sink in. If omitted, the project associated with the provider is
     * used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Whether or not to create a unique identity associated with this sink. If `false`
     * (the default), then the `writer_identity` used is `serviceAccount:cloud-logs@system.gserviceaccount.com`. If `true`,
     * then a unique service account is created and used for this sink. If you wish to publish logs across projects or utilize
     * `bigquery_options`, you must set `unique_writer_identity` to true.
     * 
     */
    @Import(name="uniqueWriterIdentity")
      private final @Nullable Output<Boolean> uniqueWriterIdentity;

    public Output<Boolean> getUniqueWriterIdentity() {
        return this.uniqueWriterIdentity == null ? Output.empty() : this.uniqueWriterIdentity;
    }

    public ProjectSinkArgs(
        @Nullable Output<ProjectSinkBigqueryOptionsArgs> bigqueryOptions,
        @Nullable Output<String> description,
        Output<String> destination,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<ProjectSinkExclusionArgs>> exclusions,
        @Nullable Output<String> filter,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> uniqueWriterIdentity) {
        this.bigqueryOptions = bigqueryOptions;
        this.description = description;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.disabled = disabled;
        this.exclusions = exclusions;
        this.filter = filter;
        this.name = name;
        this.project = project;
        this.uniqueWriterIdentity = uniqueWriterIdentity;
    }

    private ProjectSinkArgs() {
        this.bigqueryOptions = Output.empty();
        this.description = Output.empty();
        this.destination = Output.empty();
        this.disabled = Output.empty();
        this.exclusions = Output.empty();
        this.filter = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.uniqueWriterIdentity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ProjectSinkBigqueryOptionsArgs> bigqueryOptions;
        private @Nullable Output<String> description;
        private Output<String> destination;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<ProjectSinkExclusionArgs>> exclusions;
        private @Nullable Output<String> filter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> uniqueWriterIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryOptions = defaults.bigqueryOptions;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.disabled = defaults.disabled;
    	      this.exclusions = defaults.exclusions;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.uniqueWriterIdentity = defaults.uniqueWriterIdentity;
        }

        public Builder bigqueryOptions(@Nullable Output<ProjectSinkBigqueryOptionsArgs> bigqueryOptions) {
            this.bigqueryOptions = bigqueryOptions;
            return this;
        }
        public Builder bigqueryOptions(@Nullable ProjectSinkBigqueryOptionsArgs bigqueryOptions) {
            this.bigqueryOptions = Output.ofNullable(bigqueryOptions);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder destination(Output<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }
        public Builder exclusions(@Nullable Output<List<ProjectSinkExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(@Nullable List<ProjectSinkExclusionArgs> exclusions) {
            this.exclusions = Output.ofNullable(exclusions);
            return this;
        }
        public Builder exclusions(ProjectSinkExclusionArgs... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder filter(@Nullable Output<String> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder uniqueWriterIdentity(@Nullable Output<Boolean> uniqueWriterIdentity) {
            this.uniqueWriterIdentity = uniqueWriterIdentity;
            return this;
        }
        public Builder uniqueWriterIdentity(@Nullable Boolean uniqueWriterIdentity) {
            this.uniqueWriterIdentity = Output.ofNullable(uniqueWriterIdentity);
            return this;
        }        public ProjectSinkArgs build() {
            return new ProjectSinkArgs(bigqueryOptions, description, destination, disabled, exclusions, filter, name, project, uniqueWriterIdentity);
        }
    }
}
