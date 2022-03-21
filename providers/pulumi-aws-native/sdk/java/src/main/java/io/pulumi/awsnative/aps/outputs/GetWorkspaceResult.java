// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.aps.outputs;

import io.pulumi.awsnative.aps.outputs.WorkspaceTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkspaceResult {
    /**
     * The AMP Workspace alert manager definition data
     * 
     */
    private final @Nullable String alertManagerDefinition;
    /**
     * AMP Workspace alias.
     * 
     */
    private final @Nullable String alias;
    /**
     * Workspace arn.
     * 
     */
    private final @Nullable String arn;
    /**
     * AMP Workspace prometheus endpoint
     * 
     */
    private final @Nullable String prometheusEndpoint;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<WorkspaceTag> tags;
    /**
     * Required to identify a specific APS Workspace.
     * 
     */
    private final @Nullable String workspaceId;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("alertManagerDefinition") @Nullable String alertManagerDefinition,
        @CustomType.Parameter("alias") @Nullable String alias,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("prometheusEndpoint") @Nullable String prometheusEndpoint,
        @CustomType.Parameter("tags") @Nullable List<WorkspaceTag> tags,
        @CustomType.Parameter("workspaceId") @Nullable String workspaceId) {
        this.alertManagerDefinition = alertManagerDefinition;
        this.alias = alias;
        this.arn = arn;
        this.prometheusEndpoint = prometheusEndpoint;
        this.tags = tags;
        this.workspaceId = workspaceId;
    }

    /**
     * The AMP Workspace alert manager definition data
     * 
    */
    public Optional<String> getAlertManagerDefinition() {
        return Optional.ofNullable(this.alertManagerDefinition);
    }
    /**
     * AMP Workspace alias.
     * 
    */
    public Optional<String> getAlias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * Workspace arn.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * AMP Workspace prometheus endpoint
     * 
    */
    public Optional<String> getPrometheusEndpoint() {
        return Optional.ofNullable(this.prometheusEndpoint);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<WorkspaceTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Required to identify a specific APS Workspace.
     * 
    */
    public Optional<String> getWorkspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alertManagerDefinition;
        private @Nullable String alias;
        private @Nullable String arn;
        private @Nullable String prometheusEndpoint;
        private @Nullable List<WorkspaceTag> tags;
        private @Nullable String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertManagerDefinition = defaults.alertManagerDefinition;
    	      this.alias = defaults.alias;
    	      this.arn = defaults.arn;
    	      this.prometheusEndpoint = defaults.prometheusEndpoint;
    	      this.tags = defaults.tags;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder alertManagerDefinition(@Nullable String alertManagerDefinition) {
            this.alertManagerDefinition = alertManagerDefinition;
            return this;
        }
        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder prometheusEndpoint(@Nullable String prometheusEndpoint) {
            this.prometheusEndpoint = prometheusEndpoint;
            return this;
        }
        public Builder tags(@Nullable List<WorkspaceTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(WorkspaceTag... tags) {
            return tags(List.of(tags));
        }
        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(alertManagerDefinition, alias, arn, prometheusEndpoint, tags, workspaceId);
        }
    }
}
