// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentGroupAutoRollbackConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentGroupAutoRollbackConfigurationArgs Empty = new DeploymentGroupAutoRollbackConfigurationArgs();

    /**
     * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
     * 
     */
    @Import(name="events")
      private final @Nullable Output<List<String>> events;

    public Output<List<String>> getEvents() {
        return this.events == null ? Output.empty() : this.events;
    }

    public DeploymentGroupAutoRollbackConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<String>> events) {
        this.enabled = enabled;
        this.events = events;
    }

    private DeploymentGroupAutoRollbackConfigurationArgs() {
        this.enabled = Output.empty();
        this.events = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupAutoRollbackConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<String>> events;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentGroupAutoRollbackConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.events = defaults.events;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder events(@Nullable Output<List<String>> events) {
            this.events = events;
            return this;
        }
        public Builder events(@Nullable List<String> events) {
            this.events = Output.ofNullable(events);
            return this;
        }
        public Builder events(String... events) {
            return events(List.of(events));
        }        public DeploymentGroupAutoRollbackConfigurationArgs build() {
            return new DeploymentGroupAutoRollbackConfigurationArgs(enabled, events);
        }
    }
}
