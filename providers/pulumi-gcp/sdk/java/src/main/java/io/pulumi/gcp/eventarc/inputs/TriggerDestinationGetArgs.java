// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.eventarc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.eventarc.inputs.TriggerDestinationCloudRunServiceGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerDestinationGetArgs Empty = new TriggerDestinationGetArgs();

    /**
     * The Cloud Function resource name. Only Cloud Functions V2 is supported. Format: projects/{project}/locations/{location}/functions/{function}
     * 
     */
    @Import(name="cloudFunction")
      private final @Nullable Output<String> cloudFunction;

    public Output<String> getCloudFunction() {
        return this.cloudFunction == null ? Codegen.empty() : this.cloudFunction;
    }

    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project of the trigger.
     * 
     */
    @Import(name="cloudRunService")
      private final @Nullable Output<TriggerDestinationCloudRunServiceGetArgs> cloudRunService;

    public Output<TriggerDestinationCloudRunServiceGetArgs> getCloudRunService() {
        return this.cloudRunService == null ? Codegen.empty() : this.cloudRunService;
    }

    public TriggerDestinationGetArgs(
        @Nullable Output<String> cloudFunction,
        @Nullable Output<TriggerDestinationCloudRunServiceGetArgs> cloudRunService) {
        this.cloudFunction = cloudFunction;
        this.cloudRunService = cloudRunService;
    }

    private TriggerDestinationGetArgs() {
        this.cloudFunction = Codegen.empty();
        this.cloudRunService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudFunction;
        private @Nullable Output<TriggerDestinationCloudRunServiceGetArgs> cloudRunService;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudFunction = defaults.cloudFunction;
    	      this.cloudRunService = defaults.cloudRunService;
        }

        public Builder cloudFunction(@Nullable Output<String> cloudFunction) {
            this.cloudFunction = cloudFunction;
            return this;
        }
        public Builder cloudFunction(@Nullable String cloudFunction) {
            this.cloudFunction = Codegen.ofNullable(cloudFunction);
            return this;
        }
        public Builder cloudRunService(@Nullable Output<TriggerDestinationCloudRunServiceGetArgs> cloudRunService) {
            this.cloudRunService = cloudRunService;
            return this;
        }
        public Builder cloudRunService(@Nullable TriggerDestinationCloudRunServiceGetArgs cloudRunService) {
            this.cloudRunService = Codegen.ofNullable(cloudRunService);
            return this;
        }        public TriggerDestinationGetArgs build() {
            return new TriggerDestinationGetArgs(cloudFunction, cloudRunService);
        }
    }
}
