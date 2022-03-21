// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.logging.inputs.OrganizationSinkBigqueryOptionsArgs;
import io.pulumi.gcp.logging.inputs.OrganizationSinkExclusionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationSinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationSinkArgs Empty = new OrganizationSinkArgs();

    /**
     * Options that affect sinks exporting data to BigQuery. Structure documented below.
     * 
     */
    @Import(name="bigqueryOptions")
      private final @Nullable Output<OrganizationSinkBigqueryOptionsArgs> bigqueryOptions;

    public Output<OrganizationSinkBigqueryOptionsArgs> getBigqueryOptions() {
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
     * Cloud Storage bucket, a PubSub topic, a BigQuery dataset or a Cloud Logging bucket. Examples:
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
      private final @Nullable Output<List<OrganizationSinkExclusionArgs>> exclusions;

    public Output<List<OrganizationSinkExclusionArgs>> getExclusions() {
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
     * Whether or not to include children organizations in the sink export. If true, logs
     * associated with child projects are also exported; otherwise only logs relating to the provided organization are included.
     * 
     */
    @Import(name="includeChildren")
      private final @Nullable Output<Boolean> includeChildren;

    public Output<Boolean> getIncludeChildren() {
        return this.includeChildren == null ? Output.empty() : this.includeChildren;
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
     * The numeric ID of the organization to be exported to the sink.
     * 
     */
    @Import(name="orgId", required=true)
      private final Output<String> orgId;

    public Output<String> getOrgId() {
        return this.orgId;
    }

    public OrganizationSinkArgs(
        @Nullable Output<OrganizationSinkBigqueryOptionsArgs> bigqueryOptions,
        @Nullable Output<String> description,
        Output<String> destination,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<List<OrganizationSinkExclusionArgs>> exclusions,
        @Nullable Output<String> filter,
        @Nullable Output<Boolean> includeChildren,
        @Nullable Output<String> name,
        Output<String> orgId) {
        this.bigqueryOptions = bigqueryOptions;
        this.description = description;
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.disabled = disabled;
        this.exclusions = exclusions;
        this.filter = filter;
        this.includeChildren = includeChildren;
        this.name = name;
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
    }

    private OrganizationSinkArgs() {
        this.bigqueryOptions = Output.empty();
        this.description = Output.empty();
        this.destination = Output.empty();
        this.disabled = Output.empty();
        this.exclusions = Output.empty();
        this.filter = Output.empty();
        this.includeChildren = Output.empty();
        this.name = Output.empty();
        this.orgId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<OrganizationSinkBigqueryOptionsArgs> bigqueryOptions;
        private @Nullable Output<String> description;
        private Output<String> destination;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<List<OrganizationSinkExclusionArgs>> exclusions;
        private @Nullable Output<String> filter;
        private @Nullable Output<Boolean> includeChildren;
        private @Nullable Output<String> name;
        private Output<String> orgId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationSinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryOptions = defaults.bigqueryOptions;
    	      this.description = defaults.description;
    	      this.destination = defaults.destination;
    	      this.disabled = defaults.disabled;
    	      this.exclusions = defaults.exclusions;
    	      this.filter = defaults.filter;
    	      this.includeChildren = defaults.includeChildren;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
        }

        public Builder bigqueryOptions(@Nullable Output<OrganizationSinkBigqueryOptionsArgs> bigqueryOptions) {
            this.bigqueryOptions = bigqueryOptions;
            return this;
        }
        public Builder bigqueryOptions(@Nullable OrganizationSinkBigqueryOptionsArgs bigqueryOptions) {
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
        public Builder exclusions(@Nullable Output<List<OrganizationSinkExclusionArgs>> exclusions) {
            this.exclusions = exclusions;
            return this;
        }
        public Builder exclusions(@Nullable List<OrganizationSinkExclusionArgs> exclusions) {
            this.exclusions = Output.ofNullable(exclusions);
            return this;
        }
        public Builder exclusions(OrganizationSinkExclusionArgs... exclusions) {
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
        public Builder includeChildren(@Nullable Output<Boolean> includeChildren) {
            this.includeChildren = includeChildren;
            return this;
        }
        public Builder includeChildren(@Nullable Boolean includeChildren) {
            this.includeChildren = Output.ofNullable(includeChildren);
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
        public Builder orgId(Output<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        public Builder orgId(String orgId) {
            this.orgId = Output.of(Objects.requireNonNull(orgId));
            return this;
        }        public OrganizationSinkArgs build() {
            return new OrganizationSinkArgs(bigqueryOptions, description, destination, disabled, exclusions, filter, includeChildren, name, orgId);
        }
    }
}
