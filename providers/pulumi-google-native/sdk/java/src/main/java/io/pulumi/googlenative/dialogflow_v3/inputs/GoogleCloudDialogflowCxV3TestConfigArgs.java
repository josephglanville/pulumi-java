// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configurations for a test case.
 * 
 */
public final class GoogleCloudDialogflowCxV3TestConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3TestConfigArgs Empty = new GoogleCloudDialogflowCxV3TestConfigArgs();

    /**
     * Flow name. If not set, default start flow is assumed. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="flow")
      private final @Nullable Output<String> flow;

    public Output<String> getFlow() {
        return this.flow == null ? Codegen.empty() : this.flow;
    }

    /**
     * Session parameters to be compared when calculating differences.
     * 
     */
    @Import(name="trackingParameters")
      private final @Nullable Output<List<String>> trackingParameters;

    public Output<List<String>> getTrackingParameters() {
        return this.trackingParameters == null ? Codegen.empty() : this.trackingParameters;
    }

    public GoogleCloudDialogflowCxV3TestConfigArgs(
        @Nullable Output<String> flow,
        @Nullable Output<List<String>> trackingParameters) {
        this.flow = flow;
        this.trackingParameters = trackingParameters;
    }

    private GoogleCloudDialogflowCxV3TestConfigArgs() {
        this.flow = Codegen.empty();
        this.trackingParameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3TestConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> flow;
        private @Nullable Output<List<String>> trackingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3TestConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flow = defaults.flow;
    	      this.trackingParameters = defaults.trackingParameters;
        }

        public Builder flow(@Nullable Output<String> flow) {
            this.flow = flow;
            return this;
        }
        public Builder flow(@Nullable String flow) {
            this.flow = Codegen.ofNullable(flow);
            return this;
        }
        public Builder trackingParameters(@Nullable Output<List<String>> trackingParameters) {
            this.trackingParameters = trackingParameters;
            return this;
        }
        public Builder trackingParameters(@Nullable List<String> trackingParameters) {
            this.trackingParameters = Codegen.ofNullable(trackingParameters);
            return this;
        }
        public Builder trackingParameters(String... trackingParameters) {
            return trackingParameters(List.of(trackingParameters));
        }        public GoogleCloudDialogflowCxV3TestConfigArgs build() {
            return new GoogleCloudDialogflowCxV3TestConfigArgs(flow, trackingParameters);
        }
    }
}
