// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Selects and configures the service controller used by the service. The service controller handles two things: - **What is allowed:** for each API request, Chemist checks the project status, activation status, abuse status, billing status, service status, location restrictions, VPC Service Controls, SuperQuota, and other policies. - **What has happened:** for each API response, Chemist reports the telemetry data to analytics, auditing, billing, eventing, logging, monitoring, sawmill, and tracing. Chemist also accepts telemetry data not associated with API traffic, such as billing metrics. Example: control: environment: servicecontrol.googleapis.com
 * 
 */
public final class ControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final ControlArgs Empty = new ControlArgs();

    /**
     * The service controller environment to use. If empty, no control plane feature (like quota and billing) will be enabled. The recommended value for most services is servicecontrol.googleapis.com
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<String> environment;

    public Output<String> getEnvironment() {
        return this.environment == null ? Output.empty() : this.environment;
    }

    public ControlArgs(@Nullable Output<String> environment) {
        this.environment = environment;
    }

    private ControlArgs() {
        this.environment = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> environment;

        public Builder() {
    	      // Empty
        }

        public Builder(ControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environment = defaults.environment;
        }

        public Builder environment(@Nullable Output<String> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable String environment) {
            this.environment = Output.ofNullable(environment);
            return this;
        }        public ControlArgs build() {
            return new ControlArgs(environment);
        }
    }
}
