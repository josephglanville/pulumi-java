// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.eventarc.inputs.TriggerDestinationCloudRunServiceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerDestinationArgs Empty = new TriggerDestinationArgs();

    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    @Import(name="cloudFunction")
      private final @Nullable Output<String> cloudFunction;

    public Output<String> getCloudFunction() {
        return this.cloudFunction == null ? Output.empty() : this.cloudFunction;
    }

    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     * 
     */
    @Import(name="cloudRunService")
      private final @Nullable Output<TriggerDestinationCloudRunServiceArgs> cloudRunService;

    public Output<TriggerDestinationCloudRunServiceArgs> getCloudRunService() {
        return this.cloudRunService == null ? Output.empty() : this.cloudRunService;
    }

    public TriggerDestinationArgs(
        @Nullable Output<String> cloudFunction,
        @Nullable Output<TriggerDestinationCloudRunServiceArgs> cloudRunService) {
        this.cloudFunction = cloudFunction;
        this.cloudRunService = cloudRunService;
    }

    private TriggerDestinationArgs() {
        this.cloudFunction = Output.empty();
        this.cloudRunService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudFunction;
        private @Nullable Output<TriggerDestinationCloudRunServiceArgs> cloudRunService;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRunService = defaults.cloudRunService;
        }

        public Builder cloudFunction(@Nullable Output<String> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }
        public Builder cloudFunction(@Nullable String cloudFunction) {
            this.cloudFunction = Output.ofNullable(cloudFunction);
            return this;
        }
        public Builder cloudRunService(@Nullable Output<TriggerDestinationCloudRunServiceArgs> cloudRunService) {
            this.cloudRunService = cloudRunService;
            return this;
        }
        public Builder cloudRunService(@Nullable TriggerDestinationCloudRunServiceArgs cloudRunService) {
            this.cloudRunService = Output.ofNullable(cloudRunService);
            return this;
        }        public TriggerDestinationArgs build() {
            return new TriggerDestinationArgs(cloudFunction, cloudRunService);
        }
    }
}
