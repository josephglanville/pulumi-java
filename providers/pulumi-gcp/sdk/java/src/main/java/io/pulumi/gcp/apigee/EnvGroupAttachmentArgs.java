// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class EnvGroupAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvGroupAttachmentArgs Empty = new EnvGroupAttachmentArgs();

    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/envgroups/{{envgroup_name}}`.
     * 
     */
    @Import(name="envgroupId", required=true)
      private final Output<String> envgroupId;

    public Output<String> getEnvgroupId() {
        return this.envgroupId;
    }

    /**
     * The resource ID of the environment.
     * 
     */
    @Import(name="environment", required=true)
      private final Output<String> environment;

    public Output<String> getEnvironment() {
        return this.environment;
    }

    public EnvGroupAttachmentArgs(
        Output<String> envgroupId,
        Output<String> environment) {
        this.envgroupId = Objects.requireNonNull(envgroupId, "expected parameter 'envgroupId' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
    }

    private EnvGroupAttachmentArgs() {
        this.envgroupId = Codegen.empty();
        this.environment = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvGroupAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> envgroupId;
        private Output<String> environment;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvGroupAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envgroupId = defaults.envgroupId;
    	      this.environment = defaults.environment;
        }

        public Builder envgroupId(Output<String> envgroupId) {
            this.envgroupId = Objects.requireNonNull(envgroupId);
            return this;
        }
        public Builder envgroupId(String envgroupId) {
            this.envgroupId = Output.of(Objects.requireNonNull(envgroupId));
            return this;
        }
        public Builder environment(Output<String> environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }
        public Builder environment(String environment) {
            this.environment = Output.of(Objects.requireNonNull(environment));
            return this;
        }        public EnvGroupAttachmentArgs build() {
            return new EnvGroupAttachmentArgs(envgroupId, environment);
        }
    }
}
